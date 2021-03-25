package rscvanilla.bot.mudclient.models.wrappers;

import rscvanilla.bot.mudclient.MudClientWrapper;
import rscvanilla.cjci.model.classes.rsnonplayercharacterinfo.RSNonPlayerCharacterInfoClass;

// Can't user specific type com.rsc.a.a.g because java compiler can't handle same named class in same named package
public class RSNonPlayerCharacterInfo extends MudClientObjectWrapper<Object> {

    public RSNonPlayerCharacterInfo(Object internalObject, MudClientWrapper mudClientWrapper) {
        super(internalObject, mudClientWrapper);
    }

    public boolean isAttackable() {
        return getFieldValue("isAttackable", getRsNonPlayerCharacterInfo().fields.isAttackable, Boolean.class);
    }

    private RSNonPlayerCharacterInfoClass getRsNonPlayerCharacterInfo() {
        return mudClientWrapper.getClientJarClassInfo().rsNonPlayerCharacterInfo;
    }
}
