package rscvanilla.cjci.updater.core.matcher.classes.packetbuilderbase.methods;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.packetbuilderbase.PacketBuilderBaseClassMethodNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("put_byte")
public class PutByteMethodNameMatcher extends ClassMemberNameBaseMatcher implements PacketBuilderBaseClassMethodNameMatcher {

    public PutByteMethodNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}public final void )(?<fieldName>[a-zA-Z]{1,2})(?<post>\\(int var1\\) \\{\\R" +
            " {6}this\\.[a-zA-Z]{1,2}\\[this\\.[a-zA-Z]{1,2}\\+\\+] = \\(byte\\)var1;)",
            Pattern.MULTILINE
        );
    }
}
