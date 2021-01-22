package rscvanilla.hooker.models.mudclient;

import rscvanilla.hooker.annotations.YamlClassKey;
import rscvanilla.hooker.contracts.WithClassMembers;
import rscvanilla.hooker.contracts.WithFields;
import rscvanilla.hooker.models.common.BaseClass;

@YamlClassKey("mud_client")
public class MudClientClass extends BaseClass implements WithFields  {
    public MudClientClassFields fields = new MudClientClassFields();

    @Override
    public WithClassMembers getFields() { return fields; }
}
