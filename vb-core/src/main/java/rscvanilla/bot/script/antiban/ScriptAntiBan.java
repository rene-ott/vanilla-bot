package rscvanilla.bot.script.antiban;

import rscvanilla.bot.script.template.RunnableScriptState;
import rscvanilla.bot.script.template.RunnableScriptStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.bot.script.template.Script;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineEvent;
import java.io.BufferedInputStream;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class ScriptAntiBan {

    private static final Logger logger = LoggerFactory.getLogger(ScriptAntiBan.class);

    private static final long SECONDS_UNTIL_IGNORE_DETECTED_PLAYER = 10;

    private final ScriptAntiBanParams params;
    private final ScriptWithAntiBan scriptWithAntiBan;
    private final RunnableScriptState state;

    private long pauseStartTimeInMillis;
    private long logoutStartTimeInMillis;

    private final HashMap<String, Long> detectedPlayers = new HashMap<>();
    private final List<String> ignoredUsernames = new ArrayList<>();

    private volatile boolean isSoundPlaying;

    public ScriptAntiBan(ScriptAntiBanParams params,
                         ScriptWithAntiBan scriptWithAntiBan,
                         RunnableScriptState state)
    {

        this.params = params;
        this.scriptWithAntiBan = scriptWithAntiBan;
        this.state = state;
    }

    public void setIgnoredUsernames(List<String> usernames) {
        if (usernames.size() > 0) {
            scriptWithAntiBan.print("(AB) Ignoring usernames: %s", usernames);
        }

        ignoredUsernames.clear();
        ignoredUsernames.addAll(usernames);
    }

    public ScriptAntiBanParams getParams() {
        return params;
    }

    private boolean isPauseOver() {
        var millisSincePauseActivated = System.currentTimeMillis() - pauseStartTimeInMillis;
        var pauseDurationInMinutesToMillis = TimeUnit.MINUTES.toMillis(params.getPauseMinutes());

        var remainedPauseTimeInSeconds = getDifferenceInSeconds(pauseDurationInMinutesToMillis, millisSincePauseActivated);

        logger.debug("(AB) Pause over in [{}] second(s).", remainedPauseTimeInSeconds);

        return remainedPauseTimeInSeconds <= 0;
    }


    private boolean isLogoutTimeOver() {
        // When logged out then -1
        if (logoutStartTimeInMillis == -1) {
            return false;
        }

        var millisSinceLogoutActivated = System.currentTimeMillis() - logoutStartTimeInMillis;
        var logoutActivationDurationInMinutesToMillis = TimeUnit.MINUTES.toMillis(params.getLogoutMinutes());

        var remainedSecondsTillLogOut = getDifferenceInSeconds(logoutActivationDurationInMinutesToMillis, millisSinceLogoutActivated);
        logger.debug("(AB) Logout in [{}] second(s).", remainedSecondsTillLogOut);

        return remainedSecondsTillLogOut <= 0;
    }

    public synchronized void playSound() {
        if (isSoundPlaying) {
            return;
        }

        writeLog("(AB) Play Sound!");

        try (var ais = AudioSystem.getAudioInputStream(new BufferedInputStream(Script.class.getResourceAsStream("/notify.wav")))
        ) {
            // Clip is closeable, but it shouldn't be closed before it's finished
            var clip = AudioSystem.getClip();
            clip.addLineListener(e -> { if (e.getType() == LineEvent.Type.STOP) { isSoundPlaying = false; } });
            clip.open(ais);
            clip.start();
            isSoundPlaying = true;
        }
        catch(Exception ex) {
            logger.warn("Playing sound failed:\n", ex);
        }
    }

    public boolean isAnyNewPlayersDetected() {
        var playersInDistance = Arrays.stream(scriptWithAntiBan.getPlayerNamesInDistance(params.getInDistance()))
            .map(String::toLowerCase)
            .collect(Collectors.toList());

        var ignoredUsernames = this.ignoredUsernames.stream()
            .map(String::toLowerCase)
            .collect(Collectors.toList());

        playersInDistance = playersInDistance.stream()
            .filter(p -> !ignoredUsernames.contains(p))
            .collect(Collectors.toList());

        if (playersInDistance.size() == 0)
            return false;

        var currentTimeInMillis = System.currentTimeMillis();

        var isAnyNewPlayerDetected = false;
        for (var player: playersInDistance) {

            var isPlayerMarkedAsDetected = shouldMarkPlayerAsDetected(player, currentTimeInMillis);
            isAnyNewPlayerDetected = isAnyNewPlayerDetected || isPlayerMarkedAsDetected;

            if (isPlayerMarkedAsDetected) {
                this.detectedPlayers.put(player, currentTimeInMillis);
                writeLog("(AB) Player [" + player + "] has been detected.");
            }
        }

        this.detectedPlayers.entrySet().removeIf(entry -> getDifferenceInSeconds(currentTimeInMillis, entry.getValue()) > SECONDS_UNTIL_IGNORE_DETECTED_PLAYER);

        return isAnyNewPlayerDetected;
    }

    public boolean shouldMarkPlayerAsDetected(String playerName, long currentTimeInMillis) {
        var previousGreetTimeInMillis = detectedPlayers.get(playerName);
        if (previousGreetTimeInMillis == null) {
            return true;
        } else {
            return getDifferenceInSeconds(currentTimeInMillis, previousGreetTimeInMillis) > SECONDS_UNTIL_IGNORE_DETECTED_PLAYER;
        }
    }

    private long getDifferenceInSeconds(long currentTimeMillis, long previousTimeInMillis) {
        return TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - previousTimeInMillis);
    }

    public void doAntiBan() {
        logger.trace("doAntiBan");

        playSound();

        if (!state.isRunning()) {
            return;
        }

        if (params.isMissing()) {
            return;
        }

        if (params.isPause()) {
            beginPause();
        } else if (params.isStop()) {
            if (params.isLogout()) {
                beginStopping();
            } else {
                beginStop();
            }
        }

        if (params.isLogout()) {
            setLogoutTimer();
        }
    }

    public void setLogoutTimer() {
        logger.trace("setLogoutTimer");
        logoutStartTimeInMillis = System.currentTimeMillis();
    }

    public void doPauseTimeOverCheck() {
        if (state.isPaused()) {
            if (params.isLogout() && isLogoutTimeOver()) {
                beginLogout();
            }

            if (isPauseOver()) {
                endPause();
            }

            return;
        }

        if (state.isStopping()) {
            if (params.isLogout() && isLogoutTimeOver()) {
                beginLogout();
            } else {
                beginStop();
            }
        }
    }

    public void beginLogout() {
        logoutStartTimeInMillis = -1;
        state.setStatus(RunnableScriptStatus.LOGGING_OUT);
        writeLog("(AB) Logging out.");
    }

    private void beginPause() {
        pauseStartTimeInMillis = System.currentTimeMillis();
        state.setStatus(RunnableScriptStatus.PAUSED);
        writeLog("(AB) Pause for [" + params.getPauseMinutes() + "] min.");
    }

    private void endPause() {
        pauseStartTimeInMillis = -1;
        state.setStatus(RunnableScriptStatus.RUNNING);
        writeLog("(AB) Pause ended.");
    }

    private void beginStopping() {
        state.setStatus(RunnableScriptStatus.STOPPING);
        writeLog("(AB) Stopping.");
    }

    private void beginStop() {
        state.setStatus(RunnableScriptStatus.STOPPED);
        writeLog("(AB) Stop.");
    }

    private void writeLog(String msg) {
        scriptWithAntiBan.print(msg);
        logger.debug(msg);
    }
}
