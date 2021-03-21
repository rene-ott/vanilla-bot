package rscvanilla.cjci.updater.core.matcher.classes.gameelements.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class ItemsFieldNameMatcherTests extends BaseTests {

    private ItemsFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new ItemsFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassGameElements();

        var match = new StringBuilder()
                .append("public class a {").append(lineSeparator)
                .append("   public static final ArrayList aM = new ArrayList();").append(lineSeparator)
                .append("   private static final ArrayList ***aN*** = new ArrayList();")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("aN"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
