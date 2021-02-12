package rscvanilla.hook.updater.core.matcher.classes.rscharacter.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.hook.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class CurrentHealthLevelFieldNameMatcherTests extends BaseTests {

    private CurrentHealthLevelFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new CurrentHealthLevelFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassRSCharacter();

        var match = new StringBuilder()
                .append("   public com.rsc.a.a.a[] mG = new com.rsc.a.a.a[12];").append(lineSeparator)
                .append("   public int ***mH*** = 0;").append(lineSeparator)
                .append("   public int mI = 0;").append(lineSeparator)
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("mH"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
