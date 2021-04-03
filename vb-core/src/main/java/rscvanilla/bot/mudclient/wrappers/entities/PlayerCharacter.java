package rscvanilla.bot.mudclient.wrappers.entities;

import rscvanilla.bot.mudclient.wrappers.MudClientWrapper;
import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.cjci.model.classes.rsplayercharacter.RSPlayerCharacterClassFields;

public class PlayerCharacter extends Character<com.rsc.e.k> {

    public PlayerCharacter(com.rsc.e.k internalObject, MudClientWrapper mudClientWrapper) {
        super(internalObject, mudClientWrapper);
    }

    @Override
    public Position getLocalPosition() { return getDynamicLocalPosition(); }

    public String getName() { return getFieldValue("getName", getClassFields().name, String.class); }

    private RSPlayerCharacterClassFields getClassFields() {
        return mudClientWrapper.getClientJarClassInfo().rsPlayerCharacter.fields;
    }
}
