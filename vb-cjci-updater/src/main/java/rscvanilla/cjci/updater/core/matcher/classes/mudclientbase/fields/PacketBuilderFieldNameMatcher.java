package rscvanilla.cjci.updater.core.matcher.classes.mudclientbase.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclientbase.MudClientBaseClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("packet_builder")
public class PacketBuilderFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientBaseClassFieldNameMatcher {

    public PacketBuilderFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}protected final com\\.rsc\\.f\\.e )(?<fieldName>[a-zA-Z]{1,2})(?<post> = new com\\.rsc\\.f\\.e\\(5000\\);)",
            Pattern.MULTILINE
        );
    }
}
