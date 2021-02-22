package rscvanilla.bot.config;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.google.common.net.InetAddresses;

import java.util.Objects;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "name")
public class AppSettingsProxy {

    public String name;
    public String address;

    public boolean isValid() {
        if (address == null)
            return false;
        var ipAndPort = address.split(":");
        return InetAddresses.isInetAddress(ipAndPort[0]) && ipAndPort[1].matches("[0-9]{2,5}");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppSettingsProxy that = (AppSettingsProxy) o;
        return Objects.equals(name, that.name) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
}
