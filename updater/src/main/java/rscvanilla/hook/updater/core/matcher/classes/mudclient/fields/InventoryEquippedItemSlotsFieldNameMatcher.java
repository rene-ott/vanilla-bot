package rscvanilla.hook.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("inventory_equipped_item_slots")
public class InventoryEquippedItemSlotsFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {


    public final int[] nx = new int[99];
    private final int[] ny = new int[35];
    private final int nz = 30;
    public InventoryEquippedItemSlotsFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}public final int\\[] [a-zA-Z]{2} = new int\\[99];\\R" +
            " {3}private final int\\[] )(?<fieldName>[a-zA-Z]{2})(?<post> = new int\\[35];\\R" +
            " {3}private final int [a-zA-Z]{2} = 30;)",
            Pattern.MULTILINE
        );
    }
}
