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
import rscvanilla.bot.api.actions.*;
import rscvanilla.bot.config.ConfigProperties;
import rscvanilla.bot.config.ConfigService;
import rscvanilla.bot.gui.BotFrame;
import rscvanilla.bot.infrastructure.BotException;
import rscvanilla.bot.infrastructure.annotations.ScriptsDirectoryPath;
import rscvanilla.bot.infrastructure.printer.Printer;
import rscvanilla.bot.infrastructure.printer.TabPrinter;
import rscvanilla.bot.mc.MudClientWrapper;
import rscvanilla.bot.mc.interceptors.captcha.CaptchaDataLoader;
import rscvanilla.bot.mc.interceptors.captcha.CaptchaImageHandler;
import rscvanilla.bot.mc.interceptors.captcha.CaptchaImageRecognizer;
import rscvanilla.bot.mc.interceptors.gamesettings.GameSettingsHandler;
import rscvanilla.bot.mc.interceptors.ingamemessage.GameMessageHandler;
import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.engine.ScriptEngine;
import rscvanilla.bot.script.engine.ScriptFactory;
import rscvanilla.bot.script.engine.ScriptList;
import rscvanilla.bot.script.engine.executor.ScriptThreadExecutor;
import rscvanilla.bot.script.engine.loader.ScriptLoader;
import rscvanilla.bot.watcher.ScriptDirectoryContentChangeWatcher;
import rscvanilla.contracts.interceptors.MudClientCaptchaInterceptor;
import rscvanilla.contracts.interceptors.MudClientGameSettingsInterceptor;
import rscvanilla.contracts.interceptors.MudClientGameMessageInterceptor;
import rscvanilla.hook.model.Hooks;
import rscvanilla.hook.model.HooksFileReader;

import javax.inject.Singleton;
import java.io.IOException;

public class BotModule extends AbstractModule {

    private final EventBus eventBus = new EventBus("Bot EventBus");
    private final String captchaDirectoryPath;
    private final String scriptsDirectoryPath;

    public BotModule(String captchaDirectoryPath, String scriptsDirectoryPath) {
        this.captchaDirectoryPath = captchaDirectoryPath;
        this.scriptsDirectoryPath = scriptsDirectoryPath;
    }

    @Override
    protected void configure() {
        bindEventBus();
        bind(GameApplet.class).to(VanillaGameApplet.class).in(Singleton.class);
        bind(Bot.class).to(VanillaBot.class).in(Singleton.class);
        bind(MudClientWrapper.class).in(Singleton.class);
        bind(BotFrame.class).in(Singleton.class);
        bind(Printer.class).to(TabPrinter.class).in(Singleton.class);

        bind(MudClientCaptchaInterceptor.class).to(CaptchaImageHandler.class).in(Singleton.class);
        bind(CaptchaImageRecognizer.class).in(Singleton.class);
        bind(CaptchaDataLoader.class).in(Singleton.class);
        bind(ConfigProperties.class).toInstance(new ConfigProperties());
        bind(ConfigService.class).in(Singleton.class);
        bindConstant().annotatedWith(ScriptsDirectoryPath.class).to(scriptsDirectoryPath);

        bind(MudClientGameMessageInterceptor.class).to(GameMessageHandler.class).in(Singleton.class);
        bind(MudClientGameSettingsInterceptor.class).to(GameSettingsHandler.class).in(Singleton.class);

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
        bind(ScriptDependencyContext.class).in(Singleton.class);

        bindHooksFile();
    }

    private void bindHooksFile() {
        try {
            var fileReader = HooksFileReader.readHooksFile();
            bind(Hooks.class).toInstance(fileReader);
        } catch (IOException e) {
            throw new BotException("Reading hooks file failed", e);
        }
    }

    private void bindEventBus() {
        bind(EventBus.class).toInstance(eventBus);
        bindListener(Matchers.any(), new TypeListener() {
            public <I> void hear(TypeLiteral<I> typeLiteral, TypeEncounter<I> typeEncounter) {
                typeEncounter.register((InjectionListener<I>) i -> eventBus.register(i));
            }
        });
    }
}
