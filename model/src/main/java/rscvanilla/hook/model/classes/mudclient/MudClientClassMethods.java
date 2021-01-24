package rscvanilla.hook.model.classes.mudclient;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.hook.model.annotations.YamlClassInfo;
import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.model.contracts.WithClassMembers;

@JsonPropertyOrder(alphabetic = true)
@YamlClassInfo("methods")
public class MudClientClassMethods implements WithClassMembers {
    @YamlClassMemberKey("walk_to_area") public String walkToArea;
    @YamlClassMemberKey("show_login_screen") public String showLoginScreen;
}
