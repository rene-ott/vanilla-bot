package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class BankItemIdListFieldNameMatcherTests extends BaseTests {

    private BankItemIdListFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new BankItemIdListFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
            .append("   public int oL;").append(lineSeparator)
            .append("   public final int[] ***oM***;").append(lineSeparator)
            .append("   public final int[] oN;").append(lineSeparator)
            .append("   public int oO;")
            .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("oM"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
