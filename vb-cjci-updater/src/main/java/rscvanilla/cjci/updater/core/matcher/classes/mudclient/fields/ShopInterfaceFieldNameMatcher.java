package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("shop_interface")
public class ShopInterfaceFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public ShopInterfaceFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}private com\\.rsc\\.d\\.b\\.b [a-zA-Z]{2};\\R" +
            " {3}private com\\.rsc\\.d\\.b\\.c )(?<fieldName>[a-zA-Z]{2})(?<post>;\\R" +
            " {3}public boolean [a-zA-Z]{2};)",
            Pattern.MULTILINE
        );
    }
}
