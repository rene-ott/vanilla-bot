package rscvanilla.cjci.updater.core.matcher.classes.shopinterface.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.shopinterface.ShopInterfaceClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("shop_items_ids")
public class ShopItemsIdsFieldNameMatcher extends ClassMemberNameBaseMatcher implements ShopInterfaceClassFieldNameMatcher {

    public ShopItemsIdsFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}public final int\\[] [a-zA-Z]{2} = new int\\[256];\\R" +
                " {3}public final int\\[] )(?<fieldName>[a-zA-Z]{2})(?<post> = new int\\[256];\\R" +
                " {3}public final int\\[] [a-zA-Z]{2} = new int\\[256];\\R" +
                " {3}public final int\\[] [a-zA-Z]{2} = new int\\[256];)",
            Pattern.MULTILINE
        );
    }
}
