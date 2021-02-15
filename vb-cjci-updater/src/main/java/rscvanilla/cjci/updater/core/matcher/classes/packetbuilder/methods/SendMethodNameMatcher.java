package rscvanilla.cjci.updater.core.matcher.classes.packetbuilder.methods;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.packetbuilder.PacketBuilderClassMethodNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("send")
public class SendMethodNameMatcher extends ClassMemberNameBaseMatcher implements PacketBuilderClassMethodNameMatcher {

    public SendMethodNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}public final void )(?<fieldName>[a-zA-Z]{2})(?<post>\\(\\) \\{\\R" +
            " {6}if \\(!this\\.[a-zA-Z]{2}\\) \\{\\R" +
            " {9}throw new IllegalStateException\\(\"packet construction not in process!\"\\);)",
            Pattern.MULTILINE
        );
    }
}
