package rscvanilla.cjci.model.classes.gameentity;

import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.classes.BaseClass;
import rscvanilla.cjci.model.contracts.WithClassMemberGroups;
import rscvanilla.cjci.model.contracts.WithClassMembers;
import rscvanilla.cjci.model.contracts.WithFieldGroup;

@YamlClassInfo("game_entity")
public class GameEntityClass extends BaseClass implements WithFieldGroup, WithClassMemberGroups {
    public GameEntityClassFields fields = new GameEntityClassFields();

    @Override
    public WithClassMembers getFields() { return fields; }
}
