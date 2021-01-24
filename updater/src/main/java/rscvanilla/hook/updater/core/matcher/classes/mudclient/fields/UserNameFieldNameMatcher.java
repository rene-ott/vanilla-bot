package rscvanilla.hook.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("user_name")
public class UserNameFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {
    private int rx;
    private String mU;
    private String ry;
    private boolean rz;
    public UserNameFieldNameMatcher() {
        pattern = Pattern.compile(
                "(?<pre> {3}private int [a-zA-Z]{2};\\R" +
                " {3}private String )(?<fieldName>[a-zA-Z]{2})(?<post>;\\R" +
                " {3}private String [a-zA-Z]{2};\\R" +
                " {3}private boolean [a-zA-Z]{2};\\R" +
                " {3}private boolean [a-zA-Z]{2};)",
                Pattern.MULTILINE
        );
    }
}
