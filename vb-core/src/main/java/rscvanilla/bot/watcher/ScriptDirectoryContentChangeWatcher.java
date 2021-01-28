package rscvanilla.bot.watcher;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.google.common.primitives.Bytes;
import rscvanilla.bot.infrastructure.BotException;
import rscvanilla.bot.infrastructure.annotations.ScriptsDirectoryPath;
import rscvanilla.bot.infrastructure.utils.ExecutorUtil;
import rscvanilla.bot.script.events.ScriptListLoadedEvent;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class ScriptDirectoryContentChangeWatcher {

    private static final Logger logger = LoggerFactory.getLogger(ScriptDirectoryContentChangeWatcher.class);

    private final EventBus eventBus;
    private volatile ScheduledExecutorService scheduledExecutor;

    private final String scriptsDirectoryPath;
    private String tempDirectoryContentHash;
    private String directoryContentHash;

    @Inject
    public ScriptDirectoryContentChangeWatcher(@ScriptsDirectoryPath String scriptsDirectoryPath,
                                               EventBus eventBus) {
        this.eventBus = eventBus;
        this.scriptsDirectoryPath = scriptsDirectoryPath;
    }

    public void start() {
        logger.debug("Starting script directory content change watcher.");

        tempDirectoryContentHash = getCurrentDirectoryContentHash();
        logger.debug("Current temp dir content hash: {}.", getShortHash(tempDirectoryContentHash));

        scheduledExecutor = ExecutorUtil.createNamedDirWatcherScheduledExecutor();
        scheduledExecutor.scheduleWithFixedDelay(this::checkDirectoryContentChange, 1, 1 , TimeUnit.SECONDS);
    }

    public void checkDirectoryContentChange() {
        try {
            logger.trace("checkDirectoryContentChange");

            // Initial script list isn't loaded yet
            if (directoryContentHash == null) {
                return;
            }

            tempDirectoryContentHash = getCurrentDirectoryContentHash();

            if (!tempDirectoryContentHash.equals(directoryContentHash)) {
                logger.debug("Dir content hash changed from [{}] to [{}].", getShortHash(directoryContentHash), getShortHash(tempDirectoryContentHash));
                eventBus.post(new ScriptDirectoryContentChangedEvent());
            }

        } catch (Exception e) {
            logger.warn("Script dir content change check failed: ", e);
            scheduledExecutor.shutdownNow();
        }
    }

    @Subscribe
    @SuppressWarnings("unused")
    public void onScriptEngineListLoaded(ScriptListLoadedEvent event) {
        var previousDirectoryHash = directoryContentHash;
        directoryContentHash = tempDirectoryContentHash;

        logger.debug("Updated dir content hash from [{}] to [{}].", getShortHash(previousDirectoryHash), getShortHash(tempDirectoryContentHash));
    }

    private MessageDigest getDigestAlgorithm() {
        try {
            return MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new BotException(e);
        }
    }

    private static String getShortHash(String hash) {
        if (hash == null) {
            return null;
        }

        return StringUtils.left(hash, 10);
    }

    private byte[][] getArrayOfFileHashBytes() {

        var sortedFiles = getSortedDirectoryFiles();
        var sha256 = getDigestAlgorithm();

        try {
            var listOfFileHashBytes = new ArrayList<byte[]>();
            for (var file : sortedFiles) {
                listOfFileHashBytes.add(sha256.digest(Files.readAllBytes(file.toPath())));
            }
            return listOfFileHashBytes.toArray(new byte[0][]);
        } catch (IOException e) {
            throw new BotException(e);
        }
    }

    private List<File> getSortedDirectoryFiles() {
        return Arrays.stream(Objects.requireNonNull(new File(scriptsDirectoryPath).listFiles((dir, name) -> name.toLowerCase().endsWith(".class"))))
                .sorted(Comparator.comparing(File::getName))
                .collect(Collectors.toList());
    }

    private byte[] geDirectoryContentHashBytes(byte[][] hashesFilesBytes) {

        var bytes = new ArrayList<Byte>();

        for (var hashesFilesByte : hashesFilesBytes) {
            for (var b : hashesFilesByte) {
                bytes.add(b);
            }
        }
        var sha256 = getDigestAlgorithm();

        return sha256.digest(Bytes.toArray(bytes));
    }

    private String getCurrentDirectoryContentHash() {
        return bytesToHex(geDirectoryContentHashBytes(getArrayOfFileHashBytes()));
    }

    private static String bytesToHex(byte[] hashBytes) {
        var hexString = new StringBuilder(2 * hashBytes.length);

        for (byte b : hashBytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
