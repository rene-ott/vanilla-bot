package rscvanilla.bot.gui.events;

import rscvanilla.bot.config.AppSettingsProxy;

public class AppSettingsProxySelectedEvent {

    private final AppSettingsProxy proxy;

    public AppSettingsProxySelectedEvent(AppSettingsProxy proxy) {
        this.proxy = proxy;
    }

    public AppSettingsProxy getProxy() {
        return proxy;
    }
}
