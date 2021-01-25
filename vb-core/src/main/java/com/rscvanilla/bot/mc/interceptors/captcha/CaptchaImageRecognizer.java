package com.rscvanilla.bot.mc.interceptors.captcha;

import com.rscvanilla.bot.infrastructure.annotations.CaptchaDirectoryPath;

import javax.imageio.ImageIO;
import javax.inject.Inject;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CaptchaImageRecognizer {

    private final List<CaptchaImage> captchaImages;

    @Inject
    public CaptchaImageRecognizer(@CaptchaDirectoryPath String captchaDirectoryPath) {
        captchaImages = loadImages(captchaDirectoryPath);
    }

    private List<CaptchaImage> loadImages(String captchaDirectoryPath) {

        var srcDir = new File(captchaDirectoryPath);
        var imageCache = new ArrayList<CaptchaImage>();

        for (var f : Objects.requireNonNull(srcDir.listFiles((dir, name) -> name.endsWith(".png")))) {
            try {
                imageCache.add(new CaptchaImage(f.getName().replace(".png", ""), ImageIO.read(f)));
            } catch (final IOException e) {

            }
        }

        return imageCache;
    }

    public String getImageWord(BufferedImage searchImage) {

        CaptchaImage bestMatchSleepWord = null;
        var smallestDifference = Double.MAX_VALUE;

        for (var i = 0; i < captchaImages.size(); i++) {
            CaptchaImage currentImage = captchaImages.get(i);

            var difference = getDifference(searchImage, currentImage.getImage());

            if (difference < smallestDifference) {
                smallestDifference = difference;
                bestMatchSleepWord = currentImage;
            }
        }

        if (bestMatchSleepWord == null)
            return null;

        if (smallestDifference <= 5) {
            return bestMatchSleepWord.getWord();
        }

        return null;
    }

    public static double getDifference(BufferedImage imageOne, BufferedImage imageTwo) {
        int w1 = imageOne.getWidth();
        int w2 = imageTwo.getWidth();
        int h1 = imageOne.getHeight();
        int h2 = imageTwo.getHeight();
        if ((w1 != w2) || (h1 != h2)) {
            return -1;
        } else {
            long diff = 0;
            for (var j = 0; j < h1; j++) {
                for (var i = 0; i < w1; i++) {
                    //Getting the RGB values of a pixel
                    int pixel1 = imageOne.getRGB(i, j);
                    Color color1 = new Color(pixel1, true);
                    int r1 = color1.getRed();
                    int g1 = color1.getGreen();
                    int b1 = color1.getBlue();
                    int pixel2 = imageTwo.getRGB(i, j);
                    Color color2 = new Color(pixel2, true);
                    int r2 = color2.getRed();
                    int g2 = color2.getGreen();
                    int b2 = color2.getBlue();
                    //sum of differences of RGB values of the two images
                    long data = Math.abs(r1 - r2) + Math.abs(g1 - g2) + Math.abs(b1 - b2);
                    diff = diff + data;
                }
            }
            double avg = diff / (w1 * h1 * 3);
            double percentage = (avg / 255) * 100;
            return percentage;
        }
    }
}
