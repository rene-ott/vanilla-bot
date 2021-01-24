package rscvanilla.hook.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("inventory_item_list")
public class InventoryItemListFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public InventoryItemListFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}private static int [a-zA-Z]{2} = 0;\\R" +
            " {3}public final int\\[] )(?<fieldName>[a-zA-Z]{2})(?<post> = new int\\[35];\\R" +
            " {3}public final int\\[] [a-zA-Z]{2} = new int\\[35];)",
            Pattern.MULTILINE
        );
    }
}
