package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("inventory_equipped_item_slots")
public class InventoryEquippedItemSlotsFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {
    public InventoryEquippedItemSlotsFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}public final int\\[] [a-zA-Z]{2} = new int\\[99];\\R" +
            " {3}private final int\\[] )(?<fieldName>[a-zA-Z]{2})(?<post> = new int\\[35];\\R" +
            " {3}private final int [a-zA-Z]{2} = 30;)",
            Pattern.MULTILINE
        );
    }
}
