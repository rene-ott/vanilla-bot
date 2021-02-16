package rscvanilla.bot.config;

import com.google.common.base.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AppSettings {

    public String globalProxyAddress;

    public List<AppSettingsUser> users = new ArrayList<>();

    public List<AppSettingsUser> getValidUsers() {
        return users.stream()
            .filter(it -> !Strings.isNullOrEmpty(it.username) && !Strings.isNullOrEmpty(it.password))
            .collect(Collectors.toList());
    }
}
