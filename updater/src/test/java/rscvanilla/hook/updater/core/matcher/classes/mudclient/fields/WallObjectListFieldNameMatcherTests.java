package rscvanilla.hook.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.hook.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class WallObjectListFieldNameMatcherTests extends BaseTests {

    private WallObjectListFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new WallObjectListFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();
        var match = new StringBuilder()
                .append("   private com.rsc.e.e[] oC;").append(lineSeparator)
                .append("   private m[] ***oD***;").append(lineSeparator)
                .append("   private com.rsc.e.f[] oE;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("oD"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
