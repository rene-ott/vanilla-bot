package com.rscvanilla.bot;

import com.google.inject.Guice;
import com.rscvanilla.bot.bcel.CodeModifier;
import com.rscvanilla.bot.infrastructure.BotException;
import com.rscvanilla.bot.infrastructure.di.BotModule;
import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;
import javassist.CannotCompileException;
import javassist.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String [] args) {

        try {
            String nameOfRunningVM = ManagementFactory.getRuntimeMXBean().getName();
            String pid = nameOfRunningVM.substring(0, nameOfRunningVM.indexOf('@'));
            VirtualMachine vm = VirtualMachine.attach(pid);
            vm.loadAgent(getUserDir() + File.separator + "lib" + File.separator + "vanilla-bot-agent.jar");
            vm.detach();
        } catch (IOException | AttachNotSupportedException | AgentLoadException | AgentInitializationException e) {
            e.printStackTrace();
        }

        try {
            Guice.createInjector(new BotModule(getCaptchaDirPath(), getScriptsDirectoryPath())).getInstance(VanillaBot.class).load();
        } catch (BotException e) {
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
