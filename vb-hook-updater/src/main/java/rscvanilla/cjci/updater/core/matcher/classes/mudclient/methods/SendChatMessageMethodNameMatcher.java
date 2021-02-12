package rscvanilla.cjci.updater.core.matcher.classes.mudclient.methods;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassMethodNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("send_chat_message")
public class SendChatMessageMethodNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassMethodNameMatcher {
    public SendChatMessageMethodNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}private void )(?<fieldName>[a-zA-Z]{1,2})(?<post>\\(String var1\\) \\{\\R" +
            " {6}this\\.[a-zA-Z]{1,2}\\(\\)\\.[a-zA-Z]{1,2}\\(216\\);)",
            Pattern.MULTILINE
        );
    }
}
