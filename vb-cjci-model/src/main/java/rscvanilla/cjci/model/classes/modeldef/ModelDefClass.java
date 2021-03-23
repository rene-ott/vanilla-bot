package rscvanilla.cjci.model.classes.modeldef;

import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.classes.BaseClass;
import rscvanilla.cjci.model.contracts.WithClassMemberGroups;
import rscvanilla.cjci.model.contracts.WithClassMembers;
import rscvanilla.cjci.model.contracts.WithFieldGroup;

@YamlClassInfo("model_def")
public class ModelDefClass extends BaseClass implements WithFieldGroup, WithClassMemberGroups {
    public ModelDefClassFields fields = new ModelDefClassFields();

    @Override
    public WithClassMembers getFields() { return fields; }
}
