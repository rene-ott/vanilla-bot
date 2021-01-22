package rscvanilla.hooker.models.applet;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.hooker.annotations.YamlClassInfo;
import rscvanilla.hooker.annotations.YamlClassMemberKey;
import rscvanilla.hooker.contracts.WithClassMembers;

@JsonPropertyOrder(alphabetic = true)
@YamlClassInfo("fields")
public class AppletClassFields implements WithClassMembers {
    @YamlClassMemberKey("mud_client") public String mudClient;
}
