package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class LoginPanelUserUsernameControlIdFieldNameMatcherTests extends BaseTests {

    private LoginPanelUserUsernameControlIdFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new LoginPanelUserUsernameControlIdFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
            .append("            this.oU = 2;").append(lineSeparator)
            .append("            this.mU = this.qA.J(this.***pg***);").append(lineSeparator)
            .append("            this.ry = this.qA.J(this.pd);")
            .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("pg"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
