package rscvanilla.bot.mudclient.interceptors.captcha;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.bot.infrastructure.BotException;

import javax.imageio.ImageIO;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class CaptchaDataLoader {

    private static final Logger logger = LoggerFactory.getLogger(CaptchaDataLoader.class);

    public List<CaptchaImage> loadCaptchaImages() {
        var captchaImages = new ArrayList<CaptchaImage>();

        for (var entry : getDataAsSet()) {
            captchaImages.add(createCaptchaImageFromEntry(entry));
        }

        logger.debug("Loaded [{}] captcha objects.", captchaImages.size());

        return captchaImages;
    }

    private CaptchaImage createCaptchaImageFromEntry(Map.Entry<String, byte[]> entry) {
        try {
            return new CaptchaImage(entry.getKey(), ImageIO.read(new ByteArrayInputStream(entry.getValue())));

        } catch (IOException e) {
            throw BotException.of("Failed to read captcha png bytes %s", entry.getKey(), e);
        }
    }

    @SuppressWarnings("unchecked")
    private Set<Map.Entry<String, byte[]>> getDataAsSet() {
        try (var fileInputStream = CaptchaDataLoader.class.getResourceAsStream("/ocr.data"); var osTream = new ObjectInputStream(fileInputStream)) {
            return ((HashMap<String, byte[]>) osTream.readObject()).entrySet();
        } catch (IOException | ClassNotFoundException e) {
            throw BotException.of("Failed to load ocr.data", e);
        }
    }
}
