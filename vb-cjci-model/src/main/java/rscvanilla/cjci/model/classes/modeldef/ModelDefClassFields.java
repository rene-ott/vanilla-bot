package rscvanilla.cjci.model.classes.modeldef;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.model.contracts.WithClassMembers;

@JsonPropertyOrder(alphabetic = true)
@YamlClassInfo("fields")
public class ModelDefClassFields implements WithClassMembers {
    @YamlClassMemberKey("id") public String id;
    @YamlClassMemberKey("name") public String name;
}
