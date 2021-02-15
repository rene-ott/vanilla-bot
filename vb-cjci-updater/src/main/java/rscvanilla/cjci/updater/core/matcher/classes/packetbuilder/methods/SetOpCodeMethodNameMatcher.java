package rscvanilla.cjci.updater.core.matcher.classes.packetbuilder.methods;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.packetbuilder.PacketBuilderClassMethodNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("set_op_code")
public class SetOpCodeMethodNameMatcher extends ClassMemberNameBaseMatcher implements PacketBuilderClassMethodNameMatcher {

    public SetOpCodeMethodNameMatcher() {
        pattern = Pattern.compile(
        "(?<pre> {3}public void )(?<fieldName>[a-zA-Z]{2})(?<post>\\(int var1\\) \\{\\R" +
        " {6}if \\(this\\.[a-zA-Z]{2}\\) \\{\\R" +
        " {9}throw new IllegalStateException\\(\"Another packet construction in process!\"\\);)",
        Pattern.MULTILINE
        );
    }
}
