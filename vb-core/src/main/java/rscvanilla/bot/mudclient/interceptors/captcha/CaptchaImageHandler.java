package rscvanilla.bot.mc.interceptors.captcha;

import rscvanilla.bot.api.enums.OpCodeIn;
import rscvanilla.bot.api.enums.OpCodeOut;
import rscvanilla.bot.infrastructure.printer.Printer;
import rscvanilla.bot.mc.MudClientWrapper;
import rscvanilla.contracts.interceptors.MudClientCaptchaInterceptor;

import javax.imageio.ImageIO;
import javax.inject.Inject;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

// TODO: There is race possible condition on fields int sleeping function by main, script and waitUntilRested thread.
// TODO: Handle exceptions
// TODO: Handle all cases like when sleeping but another sleep event might occur etc.
public class CaptchaImageHandler implements MudClientCaptchaInterceptor {

    private String detectedWord;

    private final MudClientWrapper hooks;
    private final CaptchaImageRecognizer captchaImageRecognizer;
    private final Printer printer;

    @Inject
    public CaptchaImageHandler(Printer printer, MudClientWrapper hooks, CaptchaImageRecognizer captchaImageRecognizer) {
        this.printer = printer;
        this.hooks = hooks;
        this.captchaImageRecognizer = captchaImageRecognizer;
    }

    @Override
    public void onCaptchaInterception(byte[] captchaImage, int obj1, int captchaImageBytesLength) {
        if (obj1 == OpCodeIn.FALL_ASLEEP.id() || obj1 == OpCodeIn.INCORRECT_SLEEP_WORD.id()) {
            detectSleepWord(captchaImage, captchaImageBytesLength);

            if (isWordDetected()) {
                waitUntilReadyToSolveThenRun(this::solve);
            } else {
                //TODO: Should here be also some kind of wait until new word is received?
                askNew();
            }
        }
    }

    private void waitUntilReadyToSolveThenRun(Runnable action) {
        CompletableFuture.supplyAsync(() -> {
            try {

                while(!isReadyToSolve()) {
                    TimeUnit.MILLISECONDS.sleep(2500);

                }
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return null;
        }).thenAccept(nil -> action.run());
    }

    private void detectSleepWord(byte[] obj, int obj2) {
        try {
            var image = ImageIO.read(new ByteArrayInputStream(obj, 1, obj2));
            if (image == null) {
                System.out.println("FAILED TO READ SleepWord");
                detectedWord = null;
            } else {
                detectedWord = captchaImageRecognizer.getImageWord(image);
            }

            printer.printAsBot("Sleep word: " + detectedWord);

        } catch (IOException e) {
            e.printStackTrace();
            //TODO: Handle case
        }
    }

    private void askNew() {
        hooks.getPacketBuilder()
                .setOpCode(OpCodeOut.SEND_SLEEP_ANSWER)
                .putByte(0)
                .putString("-null-")
                .send();
    }

    private void solve() {
        hooks.getPacketBuilder()
                .setOpCode(OpCodeOut.SEND_SLEEP_ANSWER)
                .putByte(0)
                .putString(this.detectedWord)
                .send();
    }

    private boolean isWordDetected() {
        return detectedWord != null;
    }

    private boolean isReadyToSolve() {
        return hooks.fatigueSleeping.getValue() == 0;
    }
}
