package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class PlayerCharactersFieldNameMatcherTests extends BaseTests {

    private PlayerCharactersFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new PlayerCharactersFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   private final k[] nl = new k[256];").append(lineSeparator)
                .append("   private final k[] ***nm*** = new k[256];").append(lineSeparator)
                .append("   private final k[] nn = new k[2000];")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("nm"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
