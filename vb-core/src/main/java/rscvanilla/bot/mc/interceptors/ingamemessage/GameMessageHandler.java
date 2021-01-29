package rscvanilla.bot.mc.interceptors.ingamemessage;

import com.google.common.eventbus.EventBus;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.bot.events.messages.GameMessageEvent;
import rscvanilla.contracts.interceptors.MudClientGameMessageInterceptor;

import javax.inject.Inject;
import java.util.Arrays;

public class GameMessageHandler implements MudClientGameMessageInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(GameMessageHandler.class);

    private final EventBus eventBus;

    private static final String MESSAGE_TYPE_CHAT = "CHAT";
    private static final String MESSAGE_TYPE_GAME = "GAME";
    private static final String MESSAGE_TYPE_GLOBAL_CHAT = "GLOBAL_CHAT";

    @Inject
    public GameMessageHandler(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    @Override
    public void onGameMessageInterception(Object messageType, String sender, String colorPrefix, String message, String unknownParam1, int unknownParam2) {
        var messageTypeValue = messageType.toString();

        switch (messageTypeValue) {
            case MESSAGE_TYPE_CHAT -> dispatchChatMessageEvent(sender, message);
            case MESSAGE_TYPE_GAME -> dispatchGameMessageEvent(message);
            case MESSAGE_TYPE_GLOBAL_CHAT -> dispatchGameGlobalChatMessage(message);
        }

        if (Arrays.asList(new String[] { MESSAGE_TYPE_CHAT, MESSAGE_TYPE_GLOBAL_CHAT}).contains(messageTypeValue)) {
            logger.debug(
                "{}: [(sender, {}) (colorPrefix: {}) (message: {}) (unknownParam1, {}) (unknownParam2, {})]",
                messageTypeValue, sender, colorPrefix, message, unknownParam1, unknownParam2
            );
        }
    }

    private void dispatchGameMessageEvent(String message) {
        eventBus.post(GameMessageEvent.createGameMessage(message));
    }

    private void dispatchGameGlobalChatMessage(String message) {
        var fixedMessage = StringUtils.remove(message, "@gre@");
        var splitMessage = fixedMessage.split(":");

        eventBus.post(GameMessageEvent.createGlobalChatMessage(splitMessage[0], splitMessage[1]));
    }

    private void dispatchChatMessageEvent(String sender, String message) {
        var fixedSender = StringUtils.removeEnd(sender, "@yel@");

        eventBus.post(GameMessageEvent.createChatMessage(fixedSender, message));
    }
}
