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
    @YamlClassMemberKey("ground_items") public String groundItems;
    @YamlClassMemberKey("ground_items_count") public String groundItemsCount;
    @YamlClassMemberKey("ground_objects") public String groundObjects;
    @YamlClassMemberKey("ground_objects_count") public String groundObjectsCount;
    @YamlClassMemberKey("inventory_items") public String inventoryItems;
    @YamlClassMemberKey("inventory_items_count") public String inventoryItemsCount;
    @YamlClassMemberKey("inventory_items_counts") public String inventoryItemsCounts;
    @YamlClassMemberKey("is_bank_visible") public String isBankVisible;
    @YamlClassMemberKey("is_options_menu_visible") public String isOptionsMenuVisible;
    @YamlClassMemberKey("is_sleeping") public String isSleeping;
    @YamlClassMemberKey("mid_region_base_x") public String mid_region_base_x;
    @YamlClassMemberKey("mid_region_base_y") public String mid_region_base_y;
    @YamlClassMemberKey("mouse_button_click") public String mouseButtonClick;
    @YamlClassMemberKey("non_player_characters") public String nonPlayerCharacters;
    @YamlClassMemberKey("non_player_characters_count") public String nonPlayerCharactersCount;
    @YamlClassMemberKey("options_menu_texts_count") public String optionsMenuTextsCount;
    @YamlClassMemberKey("player_characters") public String playerCharacters;
    @YamlClassMemberKey("player_characters_count") public String playerCharactersCount;
    @YamlClassMemberKey("local_player_position_x") public String localPlayerPositionX;
    @YamlClassMemberKey("local_player_position_y") public String localPlayerPositionY;
    @YamlClassMemberKey("show_dialog_server_message") public String showDialogServerMessage;
    @YamlClassMemberKey("local_player") public String localPlayer;
    @YamlClassMemberKey("login_username") public String loginUsername;
    @YamlClassMemberKey("login_password") public String loginPassword;
    @YamlClassMemberKey("wall_objects") public String wallObjects;
    @YamlClassMemberKey("wall_objects_count") public String wallObjectsCount;
    @YamlClassMemberKey("bank_items") public String bankItems;
    @YamlClassMemberKey("bank_items_counts") public String bankItemsCounts;
    @YamlClassMemberKey("options_menu_texts") public String optionsMenuTexts;
    @YamlClassMemberKey("is_admin") public String isAdmin;
    @YamlClassMemberKey("login_panel") public String loginPanel;
    @YamlClassMemberKey("login_panel_password_control_id") public String loginPanelPasswordControlId;
    @YamlClassMemberKey("login_panel_username_control_id") public String loginPanelUsernameControlId;
}
