package rscvanilla.bot.mudclient.wrappers.entities;

import rscvanilla.bot.mudclient.wrappers.MudClientWrapper;
import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.cjci.model.classes.playercharacter.PlayerCharacterClassFields;

public class PlayerCharacter extends Character<com.rsc.e.k> {

    public PlayerCharacter(com.rsc.e.k internalObject, MudClientWrapper mudClientWrapper) {
        super(internalObject, mudClientWrapper);
    }

    @Override
    public Position getLocalPosition() { return getDynamicLocalPosition(); }

    public String getName() { return getFieldValue("getName", getClassFields().name, String.class); }

    private PlayerCharacterClassFields getClassFields() {
        return mudClientWrapper.getClientJarClassInfo().playerCharacter.fields;
    }
}
