package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class GameModeFieldNameMatcherTests extends BaseTests {

    private GameModeFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new GameModeFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   private int pn;").append(lineSeparator)
                .append("   private f ***po***;").append(lineSeparator)
                .append("   private int pp;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("po"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
