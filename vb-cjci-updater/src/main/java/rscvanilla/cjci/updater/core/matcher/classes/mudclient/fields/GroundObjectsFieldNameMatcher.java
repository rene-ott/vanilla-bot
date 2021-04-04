package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("ground_objects")
public class GroundObjectsFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public GroundObjectsFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}private g\\[] [a-zA-Z]{2};\\R" +
            " {3}private com\\.rsc\\.e\\.e\\[] )(?<fieldName>[a-zA-Z]{2})(?<post>;\\R" +
            " {3}private m\\[] [a-zA-Z]{2};)",
            Pattern.MULTILINE
        );
    }
}
