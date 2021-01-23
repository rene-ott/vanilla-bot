package rscvanilla.hook.updater.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.hook.updater.external.Decompiler;
import rscvanilla.hook.updater.infrastructure.AppException;
import rscvanilla.hook.updater.infrastructure.annotations.NewJarPath;
import rscvanilla.hook.updater.infrastructure.annotations.OldJarPath;

import javax.inject.Inject;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class ClientJarService {

    private static final Logger logger = LoggerFactory.getLogger(ClientJarService.class);

    private final TempDirService tempDirService;
    private final String oldJarFileName;
    private final String newJarFileName;

    @Inject
    public ClientJarService(TempDirService tempDirService,
                            @OldJarPath String oldJarPath,
                            @NewJarPath String newJarPath) {

        this.tempDirService = tempDirService;
        this.oldJarFileName = oldJarPath == null ? null : new File(oldJarPath).getName();
        this.newJarFileName = new File(newJarPath).getName();
    }

    private String getJarFileName(boolean isOld) {
        return isOld ? oldJarFileName : newJarFileName;
    }

    private String getJarFilePath(boolean isOld) {
        return Path.of(getJarDirPath(isOld), getJarFileName(isOld)).toString();
    }

    private String getJarDirPath(boolean isOld) {
        return isOld ? tempDirService.getOldDirPath() : tempDirService.getNewDirPath();
    }

    private void decompileJar(String source, boolean isOld) {
        var decompiler = Decompiler.newInstance(source, getJarDirPath(isOld));

        decompiler.decompileContext();
    }

    //TODO Refactor
    public void extractJar(boolean isOld) throws IOException {
        java.util.jar.JarFile jarfile = new java.util.jar.JarFile(new java.io.File(getJarFilePath(isOld)));
        java.util.Enumeration<java.util.jar.JarEntry> enu= jarfile.entries();
        while(enu.hasMoreElements())
        {
            java.util.jar.JarEntry je = enu.nextElement();

            System.out.println("INFO: Extracting " + je.getName());

            java.io.File fl = new java.io.File(getJarDirPath(isOld), je.getName());
            if(!fl.exists())
            {
                fl.getParentFile().mkdirs();
                fl = new java.io.File(getJarDirPath(isOld), je.getName());
            }
            if(je.isDirectory())
            {
                continue;
            }
            java.io.InputStream is = jarfile.getInputStream(je);
            java.io.FileOutputStream fo = new java.io.FileOutputStream(fl);
            while(is.available()>0)
            {
                fo.write(is.read());
            }
            fo.close();
            is.close();
        }
        jarfile.close();
    }

    public void decompileSourceFilesToTempDir(String sourcePath, boolean isOld) {
        if (isOld && sourcePath == null) {
            return;
        }

        logger.info("Decompiling {} JAR from source [{}]", isOld ? "old" : "new", sourcePath);
        decompileJar(sourcePath, isOld);
        logger.info("Decompiled {} JAR from source [{}]", isOld ? "old" : "new", sourcePath);

        try {
            logger.info("Extracting {} JAR from temp [{}]", isOld ? "old" : "new", getJarFilePath(isOld));
            extractJar(isOld);
            logger.info("Extracted {} JAR from temp [{}]", isOld ? "old" : "new", getJarFilePath(isOld));
        } catch (IOException e) {
            throw new AppException("Failed to extract JAR file.", e);
        }
    }
}
