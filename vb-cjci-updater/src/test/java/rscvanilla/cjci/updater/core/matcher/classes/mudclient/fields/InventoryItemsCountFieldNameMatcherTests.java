package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class InventoryItemsCountFieldNameMatcherTests extends BaseTests {

    private InventoryItemsCountFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new InventoryItemsCountFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();
        var match = new StringBuilder()
                .append("   private String[] pw;").append(lineSeparator)
                .append("   private boolean px;").append(lineSeparator)
                .append("   private int py;").append(lineSeparator)
                .append("   private boolean pz;").append(lineSeparator)
                .append("   private int ***pA***;").append(lineSeparator)
                .append("   private boolean pB;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("pA"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
