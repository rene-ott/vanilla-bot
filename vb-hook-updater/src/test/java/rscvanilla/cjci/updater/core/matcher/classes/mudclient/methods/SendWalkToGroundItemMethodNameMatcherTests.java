package rscvanilla.cjci.updater.core.matcher.classes.mudclient.methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class SendWalkToGroundItemMethodNameMatcherTests extends BaseTests {

    private SendWalkToGroundItemMethodNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new SendWalkToGroundItemMethodNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   private boolean ***d***(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("d"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
