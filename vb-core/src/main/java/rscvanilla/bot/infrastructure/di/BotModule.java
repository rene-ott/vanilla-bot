package rscvanilla.bot.infrastructure.di;

import com.google.common.eventbus.EventBus;
import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import com.google.inject.matcher.Matchers;
import com.google.inject.spi.InjectionListener;
import com.google.inject.spi.TypeEncounter;
import com.google.inject.spi.TypeListener;
import rscvanilla.bot.Bot;
import rscvanilla.bot.GameApplet;
import rscvanilla.bot.VanillaBot;
import rscvanilla.bot.VanillaGameApplet;
import rscvanilla.bot.config.AppSettings;
import rscvanilla.bot.config.AppSettingsFileReader;
import rscvanilla.bot.gui.BotFrame;
import rscvanilla.bot.infrastructure.BotException;
import rscvanilla.bot.infrastructure.annotations.AssetsDirectoryPath;
import rscvanilla.bot.infrastructure.annotations.ScriptsDirectoryPath;
import rscvanilla.bot.infrastructure.printer.Printer;
import rscvanilla.bot.infrastructure.printer.TabPrinter;
import rscvanilla.bot.mudclient.MudClientWrapper;
import rscvanilla.bot.mudclient.actions.*;
import rscvanilla.bot.mudclient.handlers.captcha.CaptchaDataLoader;
import rscvanilla.bot.mudclient.handlers.captcha.CaptchaHandler;
import rscvanilla.bot.mudclient.handlers.captcha.CaptchaImageRecognizer;
import rscvanilla.bot.mudclient.handlers.gamesettings.GameSettingsHandler;
import rscvanilla.bot.mudclient.handlers.userlogaction.UserCredentialManager;
import rscvanilla.bot.mudclient.handlers.userlogaction.UserLoginActionHandler;
import rscvanilla.bot.mudclient.handlers.userlogaction.UserProxyManager;
import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.engine.ScriptEngine;
import rscvanilla.bot.script.engine.ScriptFactory;
import rscvanilla.bot.script.engine.ScriptList;
import rscvanilla.bot.script.engine.executor.ScriptThreadExecutor;
import rscvanilla.bot.script.engine.loader.ScriptLoader;
import rscvanilla.bot.watcher.ScriptDirectoryContentChangeWatcher;
import rscvanilla.cjci.model.ClientJarClassInfo;
import rscvanilla.cjci.model.ClientJarClassInfoFileReader;

import javax.inject.Singleton;
import java.io.IOException;

public class BotModule extends AbstractModule {

    private final EventBus eventBus = new EventBus("Bot EventBus");
    private final String scriptsDirectoryPath;
    private final String configDirectoryPath;
    private final String assertsDirectoryPath;

    public BotModule(String scriptsDirectoryPath, String configDirectoryPath, String assertsDirectoryPath) {
        this.scriptsDirectoryPath = scriptsDirectoryPath;
        this.configDirectoryPath = configDirectoryPath;
        this.assertsDirectoryPath = assertsDirectoryPath;
    }

    @Override
    protected void configure() {
        bindEventBus();
        bind(GameApplet.class).to(VanillaGameApplet.class).in(Singleton.class);
        bind(Bot.class).to(VanillaBot.class).in(Singleton.class);
        bind(MudClientWrapper.class).in(Singleton.class);
        bind(BotFrame.class).in(Singleton.class);
        bind(Printer.class).to(TabPrinter.class).in(Singleton.class);

        bind(CaptchaImageRecognizer.class).in(Singleton.class);
        bind(CaptchaDataLoader.class).in(Singleton.class);
        bindConstant().annotatedWith(ScriptsDirectoryPath.class).to(scriptsDirectoryPath);
        bindConstant().annotatedWith(AssetsDirectoryPath.class).to(assertsDirectoryPath);

        bind(UserLoginActionHandler.class).in(Singleton.class);
        bind(UserCredentialManager.class).in(Singleton.class);
        bind(UserProxyManager.class).in(Singleton.class);

        bind(CaptchaHandler.class).in(Singleton.class);
        bind(GameSettingsHandler.class).in(Singleton.class);

        bind(ScriptDirectoryContentChangeWatcher.class).in(Singleton.class);
        bind(ScriptEngine.class).in(Singleton.class);
        bind(ScriptFactory.class).in(Singleton.class);
        bind(ScriptLoader.class).in(Singleton.class);
        bind(ScriptList.class).in(Singleton.class);
        bind(ScriptThreadExecutor.class).in(Singleton.class);

        bind(WallObjectAction.class).in(Singleton.class);
        bind(GroundObjectAction.class).in(Singleton.class);
        bind(NonPlayerCharacterAction.class).in(Singleton.class);
        bind(GroundItemAction.class).in(Singleton.class);
        bind(InventoryItemAction.class).in(Singleton.class);
        bind(WalkAction.class).in(Singleton.class);
        bind(BankAction.class).in(Singleton.class);
        bind(ShopAction.class).in(Singleton.class);
        bind(ScriptDependencyContext.class).in(Singleton.class);

        bindAppSettings();
        bindClientJarClassInfo();
    }

    private void bindAppSettings() {
        try {
            bind(AppSettings.class).toInstance(AppSettingsFileReader.readFile(configDirectoryPath));
        } catch (IOException e) {
            throw BotException.of("Reading appsettings file failed.", e);
        }
    }

    private void bindClientJarClassInfo() {
        try {
            bind(ClientJarClassInfo.class).toInstance(ClientJarClassInfoFileReader.readFile());
        } catch (IOException e) {
            throw BotException.of("Reading cjci file failed.", e);
        }
    }

    private void bindEventBus() {
        bind(EventBus.class).toInstance(eventBus);
        bindListener(Matchers.any(), new TypeListener() {
            public <I> void hear(TypeLiteral<I> typeLiteral, TypeEncounter<I> typeEncounter) {
                typeEncounter.register((InjectionListener<I>) eventBus::register);
            }
        });
    }
}
