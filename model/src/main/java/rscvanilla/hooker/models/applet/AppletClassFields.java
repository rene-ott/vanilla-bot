package rscvanilla.hooker.models.applet;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.hooker.annotations.YamlClassMemberKey;
import rscvanilla.hooker.contracts.WithClassMembers;

@JsonPropertyOrder(alphabetic = true)
public class AppletClassFields implements WithClassMembers {
    @YamlClassMemberKey("mud_client") public String mudClient;
}
