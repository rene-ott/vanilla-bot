package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("ground_items")
public class GroundItemsFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public GroundItemsFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}private m\\[] [a-zA-Z]{2};\\R" +
            " {3}private com\\.rsc\\.e\\.f\\[] )(?<fieldName>[a-zA-Z]{2})(?<post>;\\R" +
            " {3}private com\\.rsc\\.d\\.b\\.d [a-zA-Z]{2};)",
            Pattern.MULTILINE
        );
    }
}
