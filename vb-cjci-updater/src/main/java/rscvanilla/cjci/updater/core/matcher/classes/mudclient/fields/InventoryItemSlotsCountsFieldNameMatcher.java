package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("inventory_item_slots_counts")
public class InventoryItemSlotsCountsFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public InventoryItemSlotsCountsFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}public final int\\[] [a-zA-Z]{2} = new int\\[35];\\R" +
            " {3}public final int\\[] )(?<fieldName>[a-zA-Z]{2})(?<post> = new int\\[35];\\R" +
            " {3}private final j\\[] [a-zA-Z]{2} = new j\\[500];)",
            Pattern.MULTILINE
        );
    }
}
