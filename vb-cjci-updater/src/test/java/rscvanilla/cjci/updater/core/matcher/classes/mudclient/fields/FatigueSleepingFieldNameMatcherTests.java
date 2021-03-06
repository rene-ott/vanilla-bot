package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class FatigueSleepingFieldNameMatcherTests extends BaseTests {

    private FatigueSleepingFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new FatigueSleepingFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   private f po;").append(lineSeparator)
                .append("   private int pp;").append(lineSeparator)
                .append("   private int ***pq***;").append(lineSeparator)
                .append("   private int br;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("pq"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
