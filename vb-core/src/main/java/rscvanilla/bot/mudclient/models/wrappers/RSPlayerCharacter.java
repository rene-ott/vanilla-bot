package rscvanilla.bot.mudclient.models.wrappers;

import rscvanilla.bot.mudclient.MudClientWrapper;
import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.cjci.model.classes.rsplayercharacter.RSPlayerCharacterClassFields;

public class RSPlayerCharacter extends RSCharacter<com.rsc.e.k> {

    public RSPlayerCharacter(com.rsc.e.k internalObject, MudClientWrapper mudClientWrapper) {
        super(internalObject, mudClientWrapper);
    }

    @Override
    public Position getLocalPosition() { return getDynamicLocalPosition(); }

    public String getName() { return getFieldValue("getName", getClassFields().name, String.class); }

    private RSPlayerCharacterClassFields getClassFields() {
        return mudClientWrapper.getClientJarClassInfo().rsPlayerCharacter.fields;
    }
}
