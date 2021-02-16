package rscvanilla.bot.gui.events;

import rscvanilla.bot.config.AppSettingsUser;

public class AppSettingsUserSelectedEvent {

    private final AppSettingsUser user;

    public AppSettingsUserSelectedEvent(AppSettingsUser user) {
        this.user = user;
    }

    public AppSettingsUser getUser() {
        return user;
    }
}
