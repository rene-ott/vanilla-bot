package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("inventory_items_count")
public class InventoryItemsCountFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public InventoryItemsCountFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}private String\\[] [a-zA-Z]{2};\\R" +
            " {3}private boolean [a-zA-Z]{2};\\R" +
            " {3}private int [a-zA-Z]{2};\\R" +
            " {3}private boolean [a-zA-Z]{2};\\R" +
            " {3}private int )(?<fieldName>[a-zA-Z]{2})(?<post>;\\R" +
            " {3}private boolean [a-zA-Z]{2};)",
            Pattern.MULTILINE
        );
    }
}
