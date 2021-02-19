package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("bank_item_id_list")
public class BankItemIdListFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public BankItemIdListFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}public int [a-zA-Z]{2};\\R" +
            " {3}public final int\\[] )(?<fieldName>[a-zA-Z]{2})(?<post>;\\R" +
            " {3}public final int\\[] [a-zA-Z]{2};\\R" +
            " {3}public int [a-zA-Z]{2};)",
            Pattern.MULTILINE
        );
    }
}
