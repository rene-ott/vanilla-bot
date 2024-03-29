package rscvanilla.cjci.model.classes.mudclient;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.model.contracts.WithClassMembers;

@JsonPropertyOrder(alphabetic = true)
@YamlClassInfo("methods")
public class MudClientClassMethods implements WithClassMembers {
    @YamlClassMemberKey("login") public String login;
    @YamlClassMemberKey("logout") public String logout;
    @YamlClassMemberKey("send_chat_message") public String sendChatMessage;
    @YamlClassMemberKey("send_walk_to_ground_item") public String sendWalkToGroundItem;
    @YamlClassMemberKey("show_login_screen") public String showLoginScreen;
    @YamlClassMemberKey("walk_to_area") public String walkToArea;
    @YamlClassMemberKey("walk_to_object") public String walkToObject;
    @YamlClassMemberKey("walk_to_wall") public String walkToWall;

    @YamlClassMemberKey("show_game_message") public String showGameMessage;
    @YamlClassMemberKey("handle_op_code_in") public String handleOpCodeIn;

    @YamlClassMemberKey("init_game_screen_variables") public String initGameScreenVariables;
    @YamlClassMemberKey("reset_login_screen_variables") public String resetLoginScreenVariables;
    @YamlClassMemberKey("start_game") public String startGame;
}


