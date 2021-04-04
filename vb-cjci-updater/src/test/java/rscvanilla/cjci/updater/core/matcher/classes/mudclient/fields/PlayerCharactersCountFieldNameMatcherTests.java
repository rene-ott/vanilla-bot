package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class PlayerCharactersCountFieldNameMatcherTests extends BaseTests {

    private PlayerCharactersCountFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new PlayerCharactersCountFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("      this.pz = false;").append(lineSeparator)
                .append("      this.pB = false;").append(lineSeparator)
                .append("      this.***pC*** = 0;").append(lineSeparator)
                .append("      this.pD = -1;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("pC"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
