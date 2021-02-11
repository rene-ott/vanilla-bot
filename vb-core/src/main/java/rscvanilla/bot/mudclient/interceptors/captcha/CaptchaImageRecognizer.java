package rscvanilla.bot.mudclient.interceptors.captcha;

import javax.inject.Inject;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;

public class CaptchaImageRecognizer {

    private final List<CaptchaImage> captchaImages;

    @Inject
    public CaptchaImageRecognizer(CaptchaDataLoader captchaDataLoader) {
        captchaImages = captchaDataLoader.loadCaptchaImages();
    }

    public String getImageWord(BufferedImage searchImage) {

        CaptchaImage bestMatchSleepWord = null;
        var smallestDifference = Double.MAX_VALUE;

        for (var currentImage : captchaImages) {
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
