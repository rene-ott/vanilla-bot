package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class NonPlayerCharactersCountFieldNameMatcherTests extends BaseTests {

    private NonPlayerCharactersCountFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new NonPlayerCharactersCountFieldNameMatcher();
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
