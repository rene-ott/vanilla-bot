package rscvanilla.bot.config;

import com.google.common.base.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AppSettings {

    public List<AppSettingsProxy> proxies = new ArrayList<>();
    public List<AppSettingsUser> users = new ArrayList<>();

    public List<AppSettingsProxy> getValidProxies() {
        return proxies.stream()
            .filter(AppSettingsProxy::isValid)
            .collect(Collectors.toList());
    }

    public List<AppSettingsUser> getValidUsers() {
        return users.stream()
            .filter(it -> !Strings.isNullOrEmpty(it.username))
            .filter(it -> !Strings.isNullOrEmpty(it.password))
            .filter(it -> it.proxy == null || new ArrayList<>(getValidProxies()).contains(it.proxy))
            .collect(Collectors.toList());
    }

    public AppSettingsUser getProxyByUsername(String username) {
        return getValidUsers()
            .stream()
            .filter(it -> it.username.equalsIgnoreCase(username))
            .findFirst()
            .orElse(null);
    }

    public AppSettingsUser getUserByUsername(String username) {
        return getValidUsers()
            .stream()
            .filter(it -> it.username.equalsIgnoreCase(username))
            .findFirst()
            .orElse(null);
    }
}
