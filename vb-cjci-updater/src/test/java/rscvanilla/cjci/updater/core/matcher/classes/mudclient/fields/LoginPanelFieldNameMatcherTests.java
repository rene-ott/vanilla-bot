package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class LoginPanelFieldNameMatcherTests extends BaseTests {

    private LoginPanelFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new LoginPanelFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
            .append("      this.***qA*** = new com.rsc.c.e(this.dC(), 50);").append(lineSeparator)
            .append("      int var2 =")
            .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("qA"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
