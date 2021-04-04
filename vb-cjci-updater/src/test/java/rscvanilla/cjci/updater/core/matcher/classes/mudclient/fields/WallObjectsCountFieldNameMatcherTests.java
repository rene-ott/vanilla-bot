package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameMatchStatus;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class WallObjectsCountFieldNameMatcherTests extends BaseTests {

    private WallObjectsCountFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new WallObjectsCountFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   private boolean rf;").append(lineSeparator)
                .append("   private int rg;").append(lineSeparator)
                .append("   private int rh;").append(lineSeparator)
                .append("   private int ***ri***;").append(lineSeparator)
                .append("   private int rj;").append(lineSeparator)
                .append("   private String rk;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getStatus(), equalTo(ClassMemberNameMatchStatus.SINGLE));
        assertThat(result.getMemberName(), equalTo("ri"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
