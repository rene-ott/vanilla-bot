package rscvanilla.hook.updater.core.matcher.classes.rscharacter.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.hook.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class BubbleTimeoutFieldNameMatcherTests extends BaseTests {

    private BubbleTimeoutFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new BubbleTimeoutFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassRSCharacter();

        var match = new StringBuilder()
                .append("public class i extends d {").append(lineSeparator)
                .append("   public int mx;").append(lineSeparator)
                .append("   public int ***my*** = 0;").append(lineSeparator)
                .append("   public int mz = 0;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("my"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
