package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class IsSleepingFieldNameMatcherTests extends BaseTests {

    private IsSleepingFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new IsSleepingFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   private boolean pz;").append(lineSeparator)
                .append("   private int pA;").append(lineSeparator)
                .append("   private boolean ***pB***;").append(lineSeparator)
                .append("   private int pC;").append(lineSeparator)
                .append("   private int pD;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("pB"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
