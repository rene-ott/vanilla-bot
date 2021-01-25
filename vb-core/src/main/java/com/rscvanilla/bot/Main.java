package com.rscvanilla.bot;

import com.google.inject.Guice;
import com.rscvanilla.bot.bcel.CodeModifier;
import com.rscvanilla.bot.infrastructure.BotException;
import com.rscvanilla.bot.infrastructure.di.BotModule;
import javassist.CannotCompileException;
import javassist.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String [] args) {

        try {
            CodeModifier.modifyClientJar(getClientJarPath());
            Guice.createInjector(new BotModule(getCaptchaDirPath(), getScriptsDirectoryPath())).getInstance(VanillaBot.class).load();
        } catch (BotException | NotFoundException | CannotCompileException e) {
            logger.error("BOT FAILED:", e);
        }
    }

    private static String getUserDir() {
        return System.getProperty("user.dir") + File.separator;
    }

    //TODO: Injectable
    public static String getAntiBanSoundPath() {
        return getUserDir() + "res" + File.separator + "antiban" + File.separator + "notify.wav";
    }

    private static String getClientJarPath() {
        return getUserDir() + File.separator + "lib" + File.separator + "client.jar";
    }

    private static String getCaptchaDirPath() {
        return getUserDir() + File.separator + "res" + File.separator + "captcha";
    }

    private static String getScriptsDirectoryPath() {
        return getUserDir() + File.separator + "scripts";
    }
}
