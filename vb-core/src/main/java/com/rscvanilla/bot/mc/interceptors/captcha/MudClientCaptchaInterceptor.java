package com.rscvanilla.bot.mc.interceptors.captcha;

public interface MudClientCaptchaInterceptor {
    String MC_FIELD_NAME = "captchaInterceptor";
    String METHOD_NAME = "onCaptchaInterception";

    void onCaptchaInterception(byte[] captchaImage, int opCodeIn, int captchaImageBytesLength);
}