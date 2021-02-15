package rscvanilla.cjci.updater.core.matcher.classes.packetbuilderbase.methods;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.packetbuilderbase.PacketBuilderBaseClassMethodNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("put_string")
public class PutStringMethodNameMatcher extends ClassMemberNameBaseMatcher implements PacketBuilderBaseClassMethodNameMatcher {

    public PutStringMethodNameMatcher() {
        pattern = Pattern.compile(
        "(?<pre> {3}public final void )(?<fieldName>[a-zA-Z]{1,2})(?<post>\\(String var1\\) \\{\\R" +
        " {6}byte\\[] var2 = var1\\.getBytes\\(\\);)",
        Pattern.MULTILINE
        );
    }
}
