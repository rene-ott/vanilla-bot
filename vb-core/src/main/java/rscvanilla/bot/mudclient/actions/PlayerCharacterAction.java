package rscvanilla.bot.mudclient.actions;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.mudclient.wrappers.entities.PlayerCharacter;
import rscvanilla.bot.mudclient.wrappers.MudClientWrapper;

import javax.inject.Inject;
import java.util.stream.Collectors;

public class PlayerCharacterAction extends BaseAction {

    @Inject
    public PlayerCharacterAction(MudClientWrapper hooker) {
        super(hooker);
    }

    public boolean isAnotherPlayerOnPos(Position pos) {
        var allPlayers = mudClientWrapper.getPlayerList();
        var userName = mudClientWrapper.getLocalPlayer().getName();

        var players = allPlayers
            .stream()
            .filter(it -> !it.getName().equalsIgnoreCase(userName))
            .filter(it -> it.getGlobalPosition().equals(pos))
            .collect(Collectors.toList());

        return players.size() > 0;
    }

    public String[] getPlayerNamesInDistance(int distance) {
        var allPlayers = mudClientWrapper.getPlayerList();
        var userName = mudClientWrapper.getLocalPlayer().getName();

        var players = allPlayers
                .stream()
                .filter(it -> !it.getName().equalsIgnoreCase(userName))
                .filter(it -> it.isDistanceLessThanEqual(mudClientWrapper.getLocalPlayer(), distance))
                .collect(Collectors.toList());

        return players.stream().map(PlayerCharacter::getName).toArray(String[]::new);
    }
}
