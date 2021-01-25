package rscvanilla.hook.model.classes.applet;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.hook.model.annotations.YamlClassInfo;
import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.model.contracts.WithClassMembers;

@JsonPropertyOrder(alphabetic = true)
@YamlClassInfo("fields")
public class AppletClassFields implements WithClassMembers {
    @YamlClassMemberKey("mud_client") public String mudClient;
}
