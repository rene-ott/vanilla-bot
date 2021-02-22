package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class IsAdminTimeoutFieldNameMatcherTests extends BaseTests {

    private IsAdminFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new IsAdminFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   public boolean oh = false;").append(lineSeparator)
                .append("   public boolean oi = false;").append(lineSeparator)
                .append("   public boolean oj = false;").append(lineSeparator)
                .append("   public boolean ***ok***;").append(lineSeparator)
                .append("   public int aB;").append(lineSeparator)
                .append("   public int aC;").append(lineSeparator)
                .append("   public int ol = 0;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("ok"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
