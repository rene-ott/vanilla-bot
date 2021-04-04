package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class LocalPlayerFieldNameMatcherTests extends BaseTests {

    private LocalPlayerFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new LocalPlayerFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   public int oz;").append(lineSeparator)
                .append("   k ***oA***;").append(lineSeparator)
                .append("   private g[] oB;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("oA"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
