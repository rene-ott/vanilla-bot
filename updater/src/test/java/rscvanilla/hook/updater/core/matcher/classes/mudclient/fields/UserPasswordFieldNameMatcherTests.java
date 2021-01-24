package rscvanilla.hook.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.hook.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class UserPasswordFieldNameMatcherTests extends BaseTests {

    private UserPasswordFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new UserPasswordFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   private int rx;").append(lineSeparator)
                .append("   private String mU;").append(lineSeparator)
                .append("   private String ***ry***;").append(lineSeparator)
                .append("   private boolean rz;").append(lineSeparator)
                .append("   private boolean rA;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("ry"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
