package rscvanilla.hook.model.classes.mudclient;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.hook.model.annotations.YamlClassInfo;
import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.model.contracts.WithClassMembers;

@JsonPropertyOrder(alphabetic = true)
@YamlClassInfo("fields")
public class MudClientClassFields implements WithClassMembers {
    @YamlClassMemberKey("combat_style") public String combatStyle;

    @YamlClassMemberKey("ground_item_list") public String groundItemList;
    @YamlClassMemberKey("ground_item_list_index") public String groundItemListIndex;

    @YamlClassMemberKey("ground_object_list") public String groundObjectList;
    @YamlClassMemberKey("ground_object_list_index") public String groundObjectListIndex;

    @YamlClassMemberKey("npc_list") public String npcList;
    @YamlClassMemberKey("npc_list_index") public String npcListIndex;

    @YamlClassMemberKey("wall_object_list") public String wallObjectList;
    @YamlClassMemberKey("wall_object_list_index") public String wallObjectListIndex;

    @YamlClassMemberKey("player_position_x") public String playerPositionX;
    @YamlClassMemberKey("player_position_y") public String playerPositionY;

    @YamlClassMemberKey("mid_region_base_x") public String mid_region_base_x;
    @YamlClassMemberKey("mid_region_base_y") public String mid_region_base_y;

    @YamlClassMemberKey("inventory_item_list") public String inventoryItemList;
    @YamlClassMemberKey("inventory_item_list_index") public String inventoryItemListIndex;

    @YamlClassMemberKey("inventory_equipped_item_slots") public String inventoryEquippedItemSlots;
    @YamlClassMemberKey("inventory_item_slots_counts") public String inventoryItemSlotsCounts;

    @YamlClassMemberKey("selected_inventory_item_index") public String selectedInventoryItemIndex;
    @YamlClassMemberKey("selected_spell") public String selectedSpell;

    @YamlClassMemberKey("player_list") public String playerList;
    @YamlClassMemberKey("player_list_index") public String playerListIndex;
    @YamlClassMemberKey("user_name") public String userName;
    @YamlClassMemberKey("user_password") public String userPassword;
    @YamlClassMemberKey("user") public String user;

    @YamlClassMemberKey("fatigue_sleeping") public String fatigueSleeping;
    @YamlClassMemberKey("fatigue_stat") public String fatigueStat;
    @YamlClassMemberKey("is_sleeping") public String isSleeping;
    @YamlClassMemberKey("game_mode") public String gameMode;

    @YamlClassMemberKey("auto_login_timeout") public String autoLoginTimeout;
    @YamlClassMemberKey("is_options_menu_visible") public String isOptionsMenuVisible;
    @YamlClassMemberKey("options_count") public String optionsCount;
    @YamlClassMemberKey("is_bank_visible") public String isBankVisible;

    @YamlClassMemberKey("mouse_button_click") public String mouseButtonClick;
    @YamlClassMemberKey("show_dialog_server_message") public String showDialogServerMessage;
}
