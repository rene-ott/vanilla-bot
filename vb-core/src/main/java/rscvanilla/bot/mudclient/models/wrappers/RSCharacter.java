package rscvanilla.bot.mudclient.models.wrappers;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.mudclient.MudClientWrapper;
import rscvanilla.cjci.model.classes.rscharacter.RSCharacterClassFields;

public abstract class RSCharacter<T extends com.rsc.e.i> extends RSEntityWrapper<T> {

    public RSCharacter(T internalObject, MudClientWrapper mudClientWrapper) {
        super(internalObject, mudClientWrapper);
    }

    public int getBubbleTimeout() { return this.<Integer>getFieldValue("getBubbleTimeout", getClassFields().bubbleTimeout, Integer.class); }
    // Current health level is visible only if in combat
    public int getCurrentHealthLevel() { return this.<Integer>getFieldValue("getCurrentHealthLevel", getClassFields().currentHealthLevel, Integer.class); }
    public int getHealthLevel() { return this.<Integer>getFieldValue("getHealthLevel", getClassFields().healthLevel, Integer.class); }
    protected RSCharacterDirection getDirection() { return RSCharacterDirection.of(this.<Integer>getFieldValue("getDirection", getClassFields().direction, Integer.class)); }
    public int getCombatLevel() { return this.<Integer>getFieldValue("getCombatLevel", getClassFields().combatLevel, Integer.class); }

    public boolean isInCombat() { return getDirection() == RSCharacterDirection.COMBAT_A || getDirection() == RSCharacterDirection.COMBAT_B; }

    public boolean isBusy() { return getBubbleTimeout() - 60 > 0; }

    public abstract Position getLocalPosition();

    private RSCharacterClassFields getClassFields() {
        return mudClientWrapper.getClientJarClassInfo().rsCharacter.fields;
    }
}
