package rscvanilla.hook.updater.core.matcher.classes.rswallobject.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.hook.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class DirectionFieldNameMatcherTests extends BaseTests {

    private DirectionFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new DirectionFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassRSWallObject();

        var match = new StringBuilder()
            .append("   private com.rsc.c.h nb;").append(lineSeparator)
            .append("   private int ***lZ***;").append(lineSeparator)
            .append("   private com.rsc.a.a.b nc;")
            .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("lZ"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
