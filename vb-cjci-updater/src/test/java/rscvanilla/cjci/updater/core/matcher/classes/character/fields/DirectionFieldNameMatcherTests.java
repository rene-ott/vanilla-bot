package rscvanilla.cjci.updater.core.matcher.classes.character.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class DirectionFieldNameMatcherTests extends BaseTests {

    private DirectionFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new DirectionFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassRSCharacter();

        var match = new StringBuilder()
            .append("   public int[] mQ = new int[10];").append(lineSeparator)
            .append("   public int[] mR = new int[10];").append(lineSeparator)
            .append("   private int ***lZ*** = 0;")
            .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("lZ"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
