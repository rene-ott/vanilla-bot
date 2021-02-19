package rscvanilla.bot.mudclient.models.wrappers;

import rscvanilla.bot.mudclient.MudClientWrapper;

public class RSEntityInfo<T extends Object> extends RSObjectWrapper<T> {

    public RSEntityInfo(T internalObject, MudClientWrapper mudClientWrapper) {
        super(internalObject, mudClientWrapper);
    }
}
