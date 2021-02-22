package rscvanilla.cjci.updater.core.matcher.classes.mudclient.methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class HandleOpCodeInMethodNameMatcherTests extends BaseTests {

    private HandleOpCodeInMethodNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new HandleOpCodeInMethodNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("private void ***b***(com.rsc.f.a var1, int var2, int var3)")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("b"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
