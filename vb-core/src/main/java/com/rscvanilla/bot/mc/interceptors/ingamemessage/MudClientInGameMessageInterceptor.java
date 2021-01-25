package com.rscvanilla.bot.mc.interceptors.ingamemessage;

public interface MudClientInGameMessageInterceptor {
    String MC_FIELD_NAME = "inGameMessageInterceptor";
    String METHOD_NAME = "onInGameMessageInterception";

    void onInGameMessageInterception(Object messageType, String sender, String colorPrefix, String message, String unknownParam1, int unknownParam2);
}
