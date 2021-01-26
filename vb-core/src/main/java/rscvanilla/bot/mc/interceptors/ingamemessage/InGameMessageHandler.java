package rscvanilla.bot.mc.interceptors.ingamemessage;

import com.google.common.eventbus.EventBus;
import rscvanilla.bot.events.InGameMessageReceivedEvent;
import rscvanilla.bot.events.MessageEvent;
import org.apache.commons.lang3.StringUtils;
import rscvanilla.contracts.interceptors.MudClientInGameMessageInterceptor;

import javax.inject.Inject;

public class InGameMessageHandler implements MudClientInGameMessageInterceptor {

    private EventBus eventBus;

    @Inject
    public InGameMessageHandler(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    @Override
    public void onInGameMessageInterception(Object messageType, String sender, String colorPrefix, String message, String unknownParam1, int unknownParam2) {
        var messageTypeValue = messageType.toString();
        if (messageTypeValue.equals("CHAT")) {
            dispatchInGameChatMessage(sender, message);
        } else if (messageTypeValue.equals("GAME")) {
            // TODO
        } else if (messageTypeValue.equals("GLOBAL_CHAT")) {
            dispatchInGameGlobalChatMessage(message);
        }
    }

    private void dispatchInGameGlobalChatMessage(String message) {
        var fixedMessage = StringUtils.remove(message, "@gre@");
        var splitMessage = fixedMessage.split(":");

        eventBus.post(new InGameMessageReceivedEvent(MessageEvent.Type.IN_GAME_GLOBAL_CHAT, splitMessage[0], splitMessage[1]));
    }

    private void dispatchInGameChatMessage(String sender, String message) {
        var fixedSender = StringUtils.removeEnd(sender, "@yel@");

        eventBus.post(new InGameMessageReceivedEvent(MessageEvent.Type.IN_GAME_CHAT, fixedSender, message));
    }
}
