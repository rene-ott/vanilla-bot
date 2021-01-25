package rscvanilla.hook.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.hook.updater.core.matcher.classes.BaseTests;

import java.util.regex.Pattern;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class CombatStyleFieldNameMatcherTests extends BaseTests {

    private CombatStyleFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new CombatStyleFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("      this.oZ = 0;").append(lineSeparator)
                .append("      this.***pa*** = 0;").append(lineSeparator)
                .append("      this.mz = 0;").append(lineSeparator)
                .append("      this.po = f.rJ;").append(lineSeparator)
                .append("      this.pp = 0;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("pa"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
