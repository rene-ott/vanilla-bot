package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class LocalPlayerPositionYFieldNameMatcherTests extends BaseTests {

    private LocalPlayerPositionYFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new LocalPlayerPositionYFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   public com.rsc.b.e or;").append(lineSeparator)
                .append("   public int os;").append(lineSeparator)
                .append("   public int ***ot***;").append(lineSeparator)
                .append("   public boolean ou;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("ot"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
