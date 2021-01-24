package rscvanilla.hook.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.hook.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class InventoryItemSlotsCountsFieldNameMatcherTests extends BaseTests {

    private InventoryItemSlotsCountsFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new InventoryItemSlotsCountsFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   public final int[] ng = new int[35];").append(lineSeparator)
                .append("   public final int[] ***nh*** = new int[35];").append(lineSeparator)
                .append("   private final j[] ni = new j[500];")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("nh"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
