package rscvanilla.cjci.updater.core.matcher.classes.shopinterface;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;
import rscvanilla.cjci.updater.core.matcher.classes.shopinterface.fields.ShopItemsDefaultCountsFieldNameMatcher;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class ShopItemsDefaultCountsFieldNameMatcherTests extends BaseTests {

    private ShopItemsDefaultCountsFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new ShopItemsDefaultCountsFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readShopInterface();

        var match = new StringBuilder()
            .append("   public final int[] lo = new int[256];").append(lineSeparator)
            .append("   public final int[] lp = new int[256];").append(lineSeparator)
            .append("   public final int[] ***lq*** = new int[256];").append(lineSeparator)
            .append("   public final int[] lr = new int[256];")
            .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("lq"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
