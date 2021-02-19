package rscvanilla.cjci.updater.core.matcher.rsnonplayercharacterinfo.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;
import rscvanilla.cjci.updater.core.matcher.classes.rsnonplayercharacterinfo.fields.IsAttackableFieldNameMatcher;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class IsAttackableFieldNameMatcherTests extends BaseTests {

    private IsAttackableFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new IsAttackableFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassRSNonPlayerCharacterInfo();

        var match = new StringBuilder()
            .append("   private final int bR;").append(lineSeparator)
            .append("   private final boolean ***bS***;").append(lineSeparator)
            .append(lineSeparator)
            .append("   public g")
            .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("bS"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
