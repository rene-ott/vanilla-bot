package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class InventoryItemListFieldNameMatcherTests extends BaseTests {

    private InventoryItemListFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new InventoryItemListFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   private static int nf = 0;").append(lineSeparator)
                .append("   public final int[] ***ng*** = new int[35];").append(lineSeparator)
                .append("   public final int[] nh = new int[35];")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("ng"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
