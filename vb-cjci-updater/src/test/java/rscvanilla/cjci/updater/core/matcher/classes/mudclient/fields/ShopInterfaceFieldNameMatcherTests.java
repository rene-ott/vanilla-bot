package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class ShopInterfaceFieldNameMatcherTests extends BaseTests {

    private ShopInterfaceFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new ShopInterfaceFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
            .append("   private com.rsc.d.b.b oG;").append(lineSeparator)
            .append("   private com.rsc.d.b.c ***oH***;").append(lineSeparator)
            .append("   public boolean oI;")
            .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("oH"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
