package rscvanilla.bot.mudclient.handlers.captcha;

import rscvanilla.bot.mudclient.wrappers.utils.WrapperTool;
import rscvanilla.bot.mudclient.enums.OpCodeIn;
import rscvanilla.bot.mudclient.enums.OpCodeOut;
import rscvanilla.bot.infrastructure.printer.Printer;
import rscvanilla.bot.mudclient.wrappers.MudClientWrapper;
import rscvanilla.bot.mudclient.handlers.InterceptorHandler;
import rscvanilla.cjci.model.ClientJarClassInfo;
import rscvanilla.contracts.interceptors.MudClientHandleOpcodeInMethodInterceptor;

import javax.imageio.ImageIO;
import javax.inject.Inject;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

// TODO: There is race possible condition on fields int sleeping function by main, script and waitUntilRested thread.
// TODO: Handle exceptions
// TODO: Handle all cases like when sleeping but another sleep event might occur etc.
public class CaptchaHandler implements InterceptorHandler, MudClientHandleOpcodeInMethodInterceptor {

    private String detectedWord;

    private final MudClientWrapper hooks;
    private final CaptchaImageRecognizer captchaImageRecognizer;
    private final Printer printer;
    private final ClientJarClassInfo clientJarClassInfo;

    @Inject
    public CaptchaHandler(Printer printer, MudClientWrapper hooks, CaptchaImageRecognizer captchaImageRecognizer, ClientJarClassInfo clientJarClassInfo) {
        this.printer = printer;
        this.hooks = hooks;
        this.captchaImageRecognizer = captchaImageRecognizer;
        this.clientJarClassInfo = clientJarClassInfo;
    }

    @Override
    public void onBeforeHandleOpcodeIn(Object packetBase, int opCodeIn, int byteBufferLength) {
        if (opCodeIn != OpCodeIn.FALL_ASLEEP.id() && opCodeIn != OpCodeIn.INCORRECT_SLEEP_WORD.id()) {
            return;
        }

        detectSleepWord(getCaptchaImageBytes(packetBase), byteBufferLength);

        if (isWordDetected()) {
            waitUntilReadyToSolveThenRun(this::solve);
        } else {
            //TODO: Should here be also some kind of wait until new word is received?
            askNew();
        }
    }

    private byte[] getCaptchaImageBytes(Object packetBase) {
        var bufferedBytesFieldName = clientJarClassInfo.packetBuilderBase.fields.bufferedBytes;
        return WrapperTool.<byte[]>loadField(packetBase, null, "bufferedBytes", bufferedBytesFieldName, byte[].class).getValue();
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
