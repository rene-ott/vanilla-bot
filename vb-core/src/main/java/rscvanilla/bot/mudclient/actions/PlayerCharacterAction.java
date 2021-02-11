package rscvanilla.bot.mudclient.actions;

import rscvanilla.bot.mudclient.models.wrappers.RSPlayerCharacter;
import rscvanilla.bot.mudclient.MudClientWrapper;

import javax.inject.Inject;
import java.util.stream.Collectors;

public class PlayerCharacterAction extends BaseAction {

    @Inject
    public PlayerCharacterAction(MudClientWrapper hooker) {
        super(hooker);
    }

    public String[] getPlayerNamesInDistance(int distance) {
        var allPlayers = hooker.getPlayerList();
        var userName = hooker.getUser().getName();

        var players = allPlayers
                .stream()
                .filter(it -> !it.getName().equalsIgnoreCase(userName))
                .filter(it -> it.isDistanceLessThanEqual(hooker.getUser(), distance))
                .collect(Collectors.toList());

        return players.stream().map(RSPlayerCharacter::getName).toArray(String[]::new);
    }
}
