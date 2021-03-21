package rscvanilla.cjci.model.classes.gameelements;

import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.classes.BaseClass;
import rscvanilla.cjci.model.contracts.WithClassMemberGroups;
import rscvanilla.cjci.model.contracts.WithClassMembers;
import rscvanilla.cjci.model.contracts.WithFieldGroup;

@YamlClassInfo("game_elements")
public class GameElementsClass extends BaseClass implements WithFieldGroup, WithClassMemberGroups {
    public GameElementsFields fields = new GameElementsFields();

    @Override
    public WithClassMembers getFields() { return fields; }
}
