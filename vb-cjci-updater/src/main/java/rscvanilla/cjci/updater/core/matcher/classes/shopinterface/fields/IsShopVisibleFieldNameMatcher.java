package rscvanilla.cjci.updater.core.matcher.classes.shopinterface.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.shopinterface.ShopInterfaceClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("is_shop_visible")
public class IsShopVisibleFieldNameMatcher extends ClassMemberNameBaseMatcher implements ShopInterfaceClassFieldNameMatcher {

    public IsShopVisibleFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}private final k [a-zA-Z]{1,2};\\R" +
                " {3}public boolean )(?<fieldName>[a-zA-Z]{2})(?<post>;\\R" +
                " {3}public byte [a-zA-Z]{2};)",
            Pattern.MULTILINE
        );
    }
}
