package rscvanilla.cjci.model.classes.mudclient;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.model.contracts.WithClassMembers;

@JsonPropertyOrder(alphabetic = true)
@YamlClassInfo("fields")
@SuppressWarnings("unused")
public class MudClientClassFields implements WithClassMembers {
    @YamlClassMemberKey("auto_login_timeout") public String autoLoginTimeout;
    @YamlClassMemberKey("combat_style") public String combatStyle;
    @YamlClassMemberKey("fatigue_sleeping") public String fatigueSleeping;
    @YamlClassMemberKey("fatigue_stat") public String fatigueStat;
    @YamlClassMemberKey("game_mode") public String gameMode;
    @YamlClassMemberKey("ground_item_list") public String groundItemList;
    @YamlClassMemberKey("ground_item_list_index") public String groundItemListIndex;
    @YamlClassMemberKey("ground_object_list") public String groundObjectList;
    @YamlClassMemberKey("ground_object_list_index") public String groundObjectListIndex;
    @YamlClassMemberKey("inventory_item_list") public String inventoryItemList;
    @YamlClassMemberKey("inventory_item_list_index") public String inventoryItemListIndex;
    @YamlClassMemberKey("inventory_item_slots_counts") public String inventoryItemSlotsCounts;
    @YamlClassMemberKey("is_bank_visible") public String isBankVisible;
    @YamlClassMemberKey("is_options_menu_visible") public String isOptionsMenuVisible;
    @YamlClassMemberKey("is_sleeping") public String isSleeping;
    @YamlClassMemberKey("mid_region_base_x") public String mid_region_base_x;
    @YamlClassMemberKey("mid_region_base_y") public String mid_region_base_y;
    @YamlClassMemberKey("mouse_button_click") public String mouseButtonClick;
    @YamlClassMemberKey("npc_list") public String npcList;
    @YamlClassMemberKey("npc_list_index") public String npcListIndex;
    @YamlClassMemberKey("options_count") public String optionsCount;
    @YamlClassMemberKey("player_list") public String playerList;
    @YamlClassMemberKey("player_list_index") public String playerListIndex;
    @YamlClassMemberKey("player_position_x") public String playerPositionX;
    @YamlClassMemberKey("player_position_y") public String playerPositionY;
    @YamlClassMemberKey("show_dialog_server_message") public String showDialogServerMessage;
    @YamlClassMemberKey("local_player") public String localPlayer;
    @YamlClassMemberKey("login_username") public String loginUsername;
    @YamlClassMemberKey("login_password") public String loginPassword;
    @YamlClassMemberKey("wall_object_list") public String wallObjectList;
    @YamlClassMemberKey("wall_object_list_index") public String wallObjectListIndex;
    @YamlClassMemberKey("bank_item_id_list") public String bankItemIdList;
    @YamlClassMemberKey("bank_item_count_list") public String bankItemCountList;
    @YamlClassMemberKey("options_menu_text") public String optionsMenuText;
    @YamlClassMemberKey("is_admin") public String isAdmin;
    @YamlClassMemberKey("login_panel") public String loginPanel;
    @YamlClassMemberKey("login_panel_user_password_control_id") public String loginPanelUserPasswordControlId;
    @YamlClassMemberKey("login_panel_user_username_control_id") public String loginPanelUserUsernameControlId;
}
