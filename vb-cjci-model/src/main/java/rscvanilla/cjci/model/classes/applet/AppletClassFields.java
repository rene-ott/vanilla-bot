package rscvanilla.cjci.model.classes.applet;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.model.contracts.WithClassMembers;

@JsonPropertyOrder(alphabetic = true)
@YamlClassInfo("fields")
public class AppletClassFields implements WithClassMembers {
    @YamlClassMemberKey("mud_client") public String mudClient;
}
