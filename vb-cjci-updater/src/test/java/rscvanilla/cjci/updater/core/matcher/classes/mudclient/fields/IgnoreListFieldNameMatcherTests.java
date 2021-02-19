package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class IgnoreListFieldNameMatcherTests extends BaseTests {

    private IgnoreListFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new IgnoreListFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
            .append("   private final String[] nT = new String[500];").append(lineSeparator)
            .append("   private final String[] ***nU*** = new String[100];").append(lineSeparator)
            .append("   private final int[] nV = new int[500];")
            .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("nU"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
