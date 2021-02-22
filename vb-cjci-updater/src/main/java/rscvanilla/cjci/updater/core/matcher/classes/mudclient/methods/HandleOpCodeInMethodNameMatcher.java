package rscvanilla.cjci.updater.core.matcher.classes.mudclient.methods;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassMethodNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("handle_op_code_in")
public class HandleOpCodeInMethodNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassMethodNameMatcher {

    public HandleOpCodeInMethodNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre>private void )(?<fieldName>[a-zA-Z])(?<post>\\(com\\.rsc\\.f\\.a var1, int var2, int var3\\))",
            Pattern.MULTILINE
        );
    }
}
