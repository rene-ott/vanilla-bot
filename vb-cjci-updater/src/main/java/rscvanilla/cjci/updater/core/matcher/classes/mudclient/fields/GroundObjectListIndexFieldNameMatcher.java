package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("ground_object_list_index")
public class GroundObjectListIndexFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public GroundObjectListIndexFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}private int [a-zA-Z]{2};\\R" +
            " {3}private int )(?<fieldName>[a-zA-Z]{2})(?<post>;\\R" +
            " {3}private int [a-zA-Z]{2};\\R" +
            " {3}private com\\.rsc\\.b\\.b [a-zA-Z]{2};)",
            Pattern.MULTILINE
        );
    }
}
