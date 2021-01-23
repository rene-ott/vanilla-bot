package rscvanilla.hook.updater.core.matcher.classes.applet.fields;

import rscvanilla.hook.updater.core.matcher.classes.mudclient.fields.NpcListIndexFieldNameMatcher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class NpcListIndexFieldNameMatcherTests extends BaseTests {

    private NpcListIndexFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new NpcListIndexFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   private com.rsc.b.c qp;").append(lineSeparator)
                .append("   private int qq;").append(lineSeparator)
                .append("   private final int[] qr;").append(lineSeparator)
                .append("   private final int[] qs;").append(lineSeparator)
                .append("   private int ***qt***;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("qt"));
        assertThat(result.getMatch(), equalTo(match));
    }
}