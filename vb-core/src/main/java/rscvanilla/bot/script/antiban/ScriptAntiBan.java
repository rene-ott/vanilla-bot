package rscvanilla.bot.script.antiban;

import rscvanilla.bot.script.template.RunnableScriptState;
import rscvanilla.bot.script.template.RunnableScriptStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineEvent;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class ScriptAntiBan {

    private static final Logger logger = LoggerFactory.getLogger(ScriptAntiBan.class);

    private final ScriptAntiBanParams params;
    private final AntiBannable antiBannable;
    private final RunnableScriptState state;

    private long startMillis;
    private long logoutMillis;

    private final String[] GREET_LIST = { "Hey", "Hi" };
    private final HashMap<String, Long> greetedPlayers = new HashMap<>();

    private final Set<String> detectedPlayers = new HashSet<>();

    private volatile boolean isSoundPlaying;

    public ScriptAntiBan(ScriptAntiBanParams params,
                         AntiBannable antiBannable,
                         RunnableScriptState state)
    {

        this.params = params;
        this.antiBannable = antiBannable;
        this.state = state;
    }

    public ScriptAntiBanParams getParams() {
        return params;
    }

    private boolean isPauseTimeOver() {
        var millisDelta = System.currentTimeMillis() - startMillis;

        var pauseMinutesToSeconds = TimeUnit.MINUTES.toSeconds(params.getPauseMinutes()) - 570;
        var timeSincePauseStartedInSeconds = TimeUnit.MILLISECONDS.toSeconds(millisDelta);

        var difference = pauseMinutesToSeconds - timeSincePauseStartedInSeconds;
        logger.debug("Time over in {} second(s).", difference);

        return difference < 0;
    }

    private boolean isLogoutTimeOver() {
        // When logged out then -1
        if (logoutMillis == -1) {
            return false;
        }
        var millisDelta = System.currentTimeMillis() - logoutMillis;

        var pauseMinutesToSeconds = TimeUnit.MINUTES.toSeconds(params.getLogoutMinutes()) - 40;
        var timeSincePauseStartedInSeconds = TimeUnit.MILLISECONDS.toSeconds(millisDelta);

        var difference = pauseMinutesToSeconds - timeSincePauseStartedInSeconds;
        logger.debug("Logout in {} second(s).", difference);

        return difference < 0;
    }

    public synchronized void playSound() {
        if (isSoundPlaying) {
            return;
        }

        try {
            var clip = AudioSystem.getClip();
            clip.addLineListener(e -> {
                if (e.getType() == LineEvent.Type.STOP) {
                    isSoundPlaying = false;
                }
            });
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(params.getSoundPath()));
            clip.open(inputStream);
            clip.start();
            isSoundPlaying = true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void greetPlayers() {
        var systemCurrentTimeMillis = System.currentTimeMillis();

        var mustGreet = false;
        for (var player : detectedPlayers)
        {
            if (shouldGreetPlayer(player, systemCurrentTimeMillis)) {
                mustGreet = true;
                break;
            }
        }

        if (!mustGreet) {
            antiBannable.print("(AB) Not greeting any detected players [" + String.join(", ", detectedPlayers) + "].");
            return;
        }
        antiBannable.print("(AB) Greeting detected players [" + String.join(", ", detectedPlayers) + "].");

        var index = (int) (Math.random() * 1);
        var message = GREET_LIST[index];

        antiBannable.sendChatMessage(message);

        updateGreetedPlayersMap(systemCurrentTimeMillis);
    }

    private void updateGreetedPlayersMap(long currentTimeInMillis) {
        detectedPlayers.stream().forEach(it -> greetedPlayers.put(it, currentTimeInMillis));
    }

    public boolean shouldGreetPlayer(String playerName, long currentTimeMillis) {
        var previousGreetTimeInMillis = greetedPlayers.get(playerName);
        if (previousGreetTimeInMillis == null) {
            antiBannable.print("(AB) Player [" + playerName + "] hasn't been greeted before.");
            return true;
        } else {
            var deltaMinutes = TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - previousGreetTimeInMillis);
            antiBannable.print("(AB) Player [" + playerName + "] has been greeted [" + deltaMinutes + "] minutes ago.");
            return  deltaMinutes >= 20;
        }
    }

    public boolean isAnyPlayerDetected() {
        var players = antiBannable.getPlayerNamesInDistance(params.getInDistance());
        var detectedPlayers = Arrays.stream(players).collect(Collectors.toSet());
        if (detectedPlayers.size() == 0)
            return false;

        antiBannable.print("(AB) Player(s) near: " + String.join(",", detectedPlayers));
        this.detectedPlayers.addAll(detectedPlayers);

        return true;
    }

    public void doAntiBan() {
        logger.debug("doAntiBan");

        if (params.isSoundPlay()) {
            antiBannable.print("(AB) Play Sound!");
            playSound();
        }

        if (params.isGreet()) {
            antiBannable.print("(AB) Greet Players!");
            greetPlayers();
        }

        if (params.isMissing()) {
            doActionMissing();
        } else if (state.isRunning()) {
            if (params.isPause()) {
                doActionOnPause();
            } else if (params.isStop()) {
                doActionStop();
            }

            if (params.isLogout()) {
                setLogoutTimer();
            }
        }
    }

    public void setLogoutTimer() {
        logger.debug("setLogoutTimer");
        logoutMillis = System.currentTimeMillis();
    }

    public void cleanUpTransientState() {
        detectedPlayers.clear();
    }

    private void doActionMissing() {
        logger.debug("doActionMissing");
    }

    private void doActionStop() {
        logger.debug("doActionStop");
        if (params.isLogout()) {
            beginStopping();
        } else {
            beginStop();
        }
    }

    private void doActionOnPause() {
        logger.debug("doActionOnPause");
        beginPause();
    }

    public void doPauseTimeOverCheck() {
        if (state.isPaused()) {
            if (params.isLogout() && isLogoutTimeOver()) {
                logger.debug("Logout time is over");
                logger.debug(state.getStatus().toString());
                beginLogout();
            }

            if (isPauseTimeOver()) {
                logger.debug("Pause time is over.");
                endPause();
            }
        } else if (state.isStopping()) {
                if (params.isLogout()) {
                    if (isLogoutTimeOver()) {
                        logger.debug("Logout time is over");
                        logger.debug(state.getStatus().toString());
                        beginLogout();
                    }
                } else {
                    beginStop();
                }
        }
    }

    public void beginLogout() {
        logoutMillis = -1;
        state.setStatus(RunnableScriptStatus.LOGGING_OUT);
    }

    private void beginPause() {
        startMillis = System.currentTimeMillis();
        state.setStatus(RunnableScriptStatus.PAUSED);
        antiBannable.print("Pausing for [" + params.getPauseMinutes() + "] min before continuing.");
    }

    private void endPause() {
        startMillis = -1;
        state.setStatus(RunnableScriptStatus.RUNNING);
        antiBannable.print("Pausing ended.");
    }

    private void beginStopping() {
        logger.debug("beginStopping");
        state.setStatus(RunnableScriptStatus.STOPPING);
    }

    private void beginStop() {
        logger.debug("beginStop");
        state.setStatus(RunnableScriptStatus.STOPPED);
    }
}
