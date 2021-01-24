package rscvanilla.hook.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.hook.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class OptionsCountFieldNameMatcherTests extends BaseTests {

    private OptionsCountFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new OptionsCountFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   private final int nz = 30;").append(lineSeparator)
                .append("   private int ***nA*** = 0;").append(lineSeparator)
                .append("   private final int nB = 9;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("nA"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
