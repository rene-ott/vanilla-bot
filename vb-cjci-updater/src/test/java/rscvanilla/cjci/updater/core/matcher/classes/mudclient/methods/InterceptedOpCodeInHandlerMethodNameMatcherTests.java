package rscvanilla.cjci.updater.core.matcher.classes.mudclient.methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.methods.InterceptedOpCodeInHandlerMethodNameMatcher;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class InterceptedOpCodeInHandlerMethodNameMatcherTests extends BaseTests {

    private InterceptedOpCodeInHandlerMethodNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new InterceptedOpCodeInHandlerMethodNameMatcher();
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
