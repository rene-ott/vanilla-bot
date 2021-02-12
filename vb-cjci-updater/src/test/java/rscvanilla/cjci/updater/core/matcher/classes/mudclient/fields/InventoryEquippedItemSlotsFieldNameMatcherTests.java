package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class InventoryEquippedItemSlotsFieldNameMatcherTests extends BaseTests {

    private InventoryEquippedItemSlotsFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new InventoryEquippedItemSlotsFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   public final int[] nx = new int[99];").append(lineSeparator)
                .append("   private final int[] ***ny*** = new int[35];").append(lineSeparator)
                .append("   private final int nz = 30;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("ny"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
