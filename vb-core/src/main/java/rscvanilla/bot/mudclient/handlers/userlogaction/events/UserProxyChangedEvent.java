package rscvanilla.bot.mudclient.handlers.userlogaction.events;

public class UserProxyChangedEvent {

    private String proxyAddress;

    public UserProxyChangedEvent(String proxyAddress) {
        this.proxyAddress = proxyAddress;
    }

    public String getProxyAddress() {
        return proxyAddress;
    }
}
