package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("wall_objects")
public class WallObjectsFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public WallObjectsFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}private com\\.rsc\\.e\\.e\\[] [a-zA-Z]{2};\\R" +
            " {3}private m\\[] )(?<fieldName>[a-zA-Z]{2})(?<post>;\\R" +
            " {3}private com\\.rsc\\.e\\.f\\[] [a-zA-Z]{2};)",
            Pattern.MULTILINE
        );
    }
}
