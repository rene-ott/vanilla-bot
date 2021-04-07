package rscvanilla.bot.infrastructure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class SystemTrayNotification {

    private static final Logger logger = LoggerFactory.getLogger(SystemTrayNotification.class);

    public static void showWarning(String caption, String message) {
        if (SystemTray.isSupported()) {
            try {
                displayWarning(caption, message);
            } catch (AWTException | IOException e) {
                logger.warn("System tray notification failed", e);
            }
        }
    }

    private static void displayWarning(String caption, String message) throws AWTException, IOException {
        var tray = SystemTray.getSystemTray();

        var image = ImageIO.read(Objects.requireNonNull(SystemTrayNotification.class.getClassLoader().getResource("icon.png")));

        var trayIcon = new TrayIcon(image);
        trayIcon.setImageAutoSize(true);
        tray.add(trayIcon);

        trayIcon.displayMessage(caption, message, TrayIcon.MessageType.WARNING);
    }
}
