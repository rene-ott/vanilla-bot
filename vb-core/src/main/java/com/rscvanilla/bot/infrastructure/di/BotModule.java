package com.rscvanilla.bot.infrastructure.di;

import com.google.common.eventbus.EventBus;
import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import com.google.inject.matcher.Matchers;
import com.google.inject.spi.InjectionListener;
import com.google.inject.spi.TypeEncounter;
import com.google.inject.spi.TypeListener;
import com.rscvanilla.bot.Bot;
import com.rscvanilla.bot.GameApplet;
import com.rscvanilla.bot.VanillaBot;
import com.rscvanilla.bot.VanillaGameApplet;
import com.rscvanilla.bot.api.action.*;
import com.rscvanilla.bot.gui.BotFrame;
import com.rscvanilla.bot.infrastructure.BotException;
import com.rscvanilla.bot.infrastructure.annotations.CaptchaDirectoryPath;
import com.rscvanilla.bot.infrastructure.annotations.ScriptsDirectoryPath;
import com.rscvanilla.bot.infrastructure.printer.Printer;
import com.rscvanilla.bot.infrastructure.printer.TabPrinter;
import com.rscvanilla.bot.mc.MudClientHooker;
import com.rscvanilla.bot.mc.interceptors.captcha.CaptchaImageHandler;
import com.rscvanilla.bot.mc.interceptors.captcha.CaptchaImageRecognizer;
import com.rscvanilla.bot.mc.interceptors.gamesettings.GameSettingsHandler;
import com.rscvanilla.bot.mc.interceptors.ingamemessage.InGameMessageHandler;
import com.rscvanilla.bot.script.ScriptDependencyContext;
import com.rscvanilla.bot.script.engine.ScriptEngine;
import com.rscvanilla.bot.script.engine.ScriptFactory;
import com.rscvanilla.bot.script.engine.ScriptList;
import com.rscvanilla.bot.script.engine.executor.ScriptThreadExecutor;
import com.rscvanilla.bot.script.engine.loader.ScriptLoader;
import com.rscvanilla.bot.watcher.ScriptDirectoryContentChangeWatcher;
import rscvanilla.contracts.interceptors.MudClientCaptchaInterceptor;
import rscvanilla.contracts.interceptors.MudClientGameSettingsInterceptor;
import rscvanilla.contracts.interceptors.MudClientInGameMessageInterceptor;
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
        bind(MudClientHooker.class).in(Singleton.class);
        bind(BotFrame.class).in(Singleton.class);
        bind(Printer.class).to(TabPrinter.class).in(Singleton.class);

        bind(MudClientCaptchaInterceptor.class).to(CaptchaImageHandler.class).in(Singleton.class);
        bind(CaptchaImageRecognizer.class).in(Singleton.class);
        bindConstant().annotatedWith(CaptchaDirectoryPath.class).to(captchaDirectoryPath);
        bindConstant().annotatedWith(ScriptsDirectoryPath.class).to(scriptsDirectoryPath);

        bind(MudClientInGameMessageInterceptor.class).to(InGameMessageHandler.class).in(Singleton.class);
        bind(MudClientGameSettingsInterceptor.class).to(GameSettingsHandler.class).in(Singleton.class);

        bind(ScriptDirectoryContentChangeWatcher.class).in(Singleton.class);
        bind(ScriptEngine.class).in(Singleton.class);
        bind(ScriptFactory.class).in(Singleton.class);
        bind(ScriptLoader.class).in(Singleton.class);
        bind(ScriptList.class).in(Singleton.class);
        bind(ScriptThreadExecutor.class).in(Singleton.class);

        bind(WallObjectAction.class).in(Singleton.class);
        bind(ObjectAction.class).in(Singleton.class);
        bind(NpcAction.class).in(Singleton.class);
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
