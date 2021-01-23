package rscvanilla.hook.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.hook.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class GroundObjectListIndexFieldNameMatcherTests extends BaseTests {

    private NpcListFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new NpcListFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   private final j[] ni = new j[500];").append(lineSeparator)
                .append("   private final j[] ***nj*** = new j[500];")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("pr"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
