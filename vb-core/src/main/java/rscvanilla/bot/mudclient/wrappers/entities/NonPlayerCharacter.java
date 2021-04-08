package rscvanilla.bot.mudclient.wrappers.entities;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.mudclient.wrappers.MudClientWrapper;
import rscvanilla.cjci.model.classes.nonplayercharacter.NonPlayerCharacterClassMethods;

public class NonPlayerCharacter extends Character<com.rsc.e.j> {

    public NonPlayerCharacter(com.rsc.e.j internalObject, MudClientWrapper mudClientWrapper) {
        super(internalObject, mudClientWrapper);
    }

    @Override
    public Position getLocalPosition() { return getDynamicLocalPosition(); }

    private NonPlayerCharacterInfo getInfo() {
        return new NonPlayerCharacterInfo(getMethod(getClassMethods().getInfo, "cA").invokeFunction(), mudClientWrapper);
    }

    public boolean isAttackable() { return getInfo().isAttackable(); }

    private NonPlayerCharacterClassMethods getClassMethods() {
        return mudClientWrapper.getClientJarClassInfo().nonPlayerCharacter.methods;
    }
}
