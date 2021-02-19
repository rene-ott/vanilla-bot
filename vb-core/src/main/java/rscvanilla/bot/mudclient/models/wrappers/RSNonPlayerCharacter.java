package rscvanilla.bot.mudclient.models.wrappers;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.mudclient.MudClientWrapper;

public class RSNonPlayerCharacter extends RSCharacter<com.rsc.e.j> {

    public RSNonPlayerCharacter(com.rsc.e.j internalObject, MudClientWrapper mudClientWrapper) {
        super(internalObject, mudClientWrapper);
    }

    @Override
    public Position getLocalPosition() { return getDynamicLocalPosition(); }

    private RSNonPlayerCharacterInfo getInfo() {
        return new RSNonPlayerCharacterInfo(getMethod("getNonPlayerCharacterInfo", "cA").invokeFunction(), mudClientWrapper);
    }

    public boolean isAttackable() { return getInfo().isAttackable(); }
}
