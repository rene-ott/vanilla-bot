package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("inventory_items")
public class InventoryItemsFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public InventoryItemsFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}private static int [a-zA-Z]{2} = 0;\\R" +
            " {3}public final int\\[] )(?<fieldName>[a-zA-Z]{2})(?<post> = new int\\[35];\\R" +
            " {3}public final int\\[] [a-zA-Z]{2} = new int\\[35];)",
            Pattern.MULTILINE
        );
    }
}
