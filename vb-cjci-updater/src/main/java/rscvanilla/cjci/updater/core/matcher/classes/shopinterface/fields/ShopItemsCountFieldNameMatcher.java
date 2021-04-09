package rscvanilla.cjci.updater.core.matcher.classes.shopinterface.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.shopinterface.ShopInterfaceClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("shop_items_count")
public class ShopItemsCountFieldNameMatcher extends ClassMemberNameBaseMatcher implements ShopInterfaceClassFieldNameMatcher {

    public ShopItemsCountFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}private final k [a-zA-Z]{1,2};\\R" +
                " {3}public boolean [a-zA-Z]{2};\\R" +
                " {3}public byte [a-zA-Z]{2};\\R" +
                " {3}public int )(?<fieldName>[a-zA-Z]{2})(?<post>;)",
            Pattern.MULTILINE
        );
    }
}
