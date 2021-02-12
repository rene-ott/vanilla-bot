package rscvanilla.hook.updater.core.matcher.classes.rswallobject.fields;

import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.hook.updater.core.matcher.classes.rswallobject.RSWallObjectClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("direction")
public class DirectionFieldNameMatcher extends ClassMemberNameBaseMatcher implements RSWallObjectClassFieldNameMatcher {

    public DirectionFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}private com\\.rsc\\.c\\.h [a-zA-Z]{2};\\R" +
            " {3}private int )(?<fieldName>[a-zA-Z]{2})(?<post>;\\R" +
            " {3}private com\\.rsc\\.a\\.a\\.b [a-zA-Z]{2};)",
            Pattern.MULTILINE
        );
    }
}
