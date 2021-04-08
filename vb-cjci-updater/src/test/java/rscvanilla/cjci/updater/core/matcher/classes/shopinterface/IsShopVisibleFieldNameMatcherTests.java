package rscvanilla.cjci.updater.core.matcher.classes.shopinterface;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;
import rscvanilla.cjci.updater.core.matcher.classes.shopinterface.fields.IsShopVisibleFieldNameMatcher;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class IsShopVisibleFieldNameMatcherTests extends BaseTests {

    private IsShopVisibleFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new IsShopVisibleFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readShopInterface();

        var match = new StringBuilder()
            .append("   private final k M;").append(lineSeparator)
            .append("   public boolean ***lg***;").append(lineSeparator)
            .append("   public byte lh;")
            .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("lg"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
