package rscvanilla.bot.mudclient.handlers.gamemodel;

import rscvanilla.bot.mudclient.wrappers.utils.FieldWrapper;
import rscvanilla.bot.mudclient.wrappers.utils.WrapperTool;
import rscvanilla.cjci.model.ClientJarClassInfo;

public class ItemDefWrapper {

    public FieldWrapper<Integer> id;
    public FieldWrapper<String> name;

    public ItemDefWrapper(ClientJarClassInfo clientJarClassInfo, Object object) {
        id = WrapperTool.loadField(object, null, "id", clientJarClassInfo.modelDef.fields.id, Integer.class);
        name = WrapperTool.loadField(object, null, "name", clientJarClassInfo.modelDef.fields.name, String.class);
    }
}
