package rscvanilla.hooker.models.mudclient;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.hooker.annotations.YamlClassInfo;
import rscvanilla.hooker.annotations.YamlClassMemberKey;
import rscvanilla.hooker.contracts.WithClassMembers;

@JsonPropertyOrder(alphabetic = true)
@YamlClassInfo("interceptors")
public class MudClientClassInterceptors implements WithClassMembers {
    @YamlClassMemberKey("game_settings") public String gameSettings;
}
