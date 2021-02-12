package rscvanilla.cjci.updater.core.matcher.classes.rscharacter.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class CombatLevelFieldNameMatcherTests extends BaseTests {

    private CombatLevelFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new CombatLevelFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassRSCharacter();

        var match = new StringBuilder()
            .append("   public int mJ = 0;").append(lineSeparator)
            .append("   public int ***mK*** = -1;").append(lineSeparator)
            .append("   public String mi;").append(lineSeparator)
            .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("mK"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
