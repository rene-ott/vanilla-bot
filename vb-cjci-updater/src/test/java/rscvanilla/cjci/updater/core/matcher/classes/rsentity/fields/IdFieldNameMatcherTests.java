package rscvanilla.cjci.updater.core.matcher.classes.rsentity.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class IdFieldNameMatcherTests extends BaseTests {

    private IdFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new IdFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassRSEntity();

        var match = new StringBuilder()
            .append("public abstract class d {").append(lineSeparator)
            .append("   protected int ge;").append(lineSeparator)
            .append("   protected int ***bp***;").append(lineSeparator)
            .append("   protected int lT;").append(lineSeparator)
            .append("   protected int lU;").append(lineSeparator)
            .append("   protected int lV;").append(lineSeparator)
            .append("   protected int lW;").append(lineSeparator)
            .append("   protected int lX;").append(lineSeparator)
            .append("   private boolean lY;").append(lineSeparator)
            .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("bp"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
