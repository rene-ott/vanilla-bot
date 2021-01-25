package com.rscvanilla.bot.mc.interceptors.captcha;

import java.awt.image.BufferedImage;

public class CaptchaImage {

    private String word;
    private BufferedImage image;

    public CaptchaImage(String word, BufferedImage image) {

        this.word = word;
        this.image = image;
    }

    public BufferedImage getImage() {
        return image;
    }

    public String getWord() {
        return word;
    }
}
