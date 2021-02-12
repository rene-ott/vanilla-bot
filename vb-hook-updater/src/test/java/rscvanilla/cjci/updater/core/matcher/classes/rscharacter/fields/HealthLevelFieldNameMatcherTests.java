package rscvanilla.cjci.updater.core.matcher.classes.rscharacter.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class HealthLevelFieldNameMatcherTests extends BaseTests {

    private HealthLevelFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new HealthLevelFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassRSCharacter();

        var match = new StringBuilder()
            .append("   public com.rsc.a.a.a[] mG = new com.rsc.a.a.a[12];").append(lineSeparator)
            .append("   public int mH = 0;").append(lineSeparator)
            .append("   public int ***mI*** = 0;").append(lineSeparator)
            .append("   public int mJ = 0;").append(lineSeparator)
            .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("mI"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
