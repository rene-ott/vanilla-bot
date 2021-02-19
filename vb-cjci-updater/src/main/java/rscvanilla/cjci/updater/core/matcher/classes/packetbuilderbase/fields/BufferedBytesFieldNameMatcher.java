package rscvanilla.cjci.updater.core.matcher.classes.packetbuilderbase.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.packetbuilderbase.PacketBuilderBaseClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("buffered_bytes")
public class BufferedBytesFieldNameMatcher extends ClassMemberNameBaseMatcher implements PacketBuilderBaseClassFieldNameMatcher {

    public BufferedBytesFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}public byte\\[] )(?<fieldName>[a-zA-Z]{1,2})(?<post>;)",
            Pattern.MULTILINE
        );
    }
}
