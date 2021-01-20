import hooker.matchers.mudclient.NpcListFieldMatcher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.*;


public class NpcListFieldMatcherTests extends BaseTests {

    private NpcListFieldMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new NpcListFieldMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   private final j[] ni = new j[500];").append(lineSeparator)
                .append("   private final j[] nj = new j[500];")
                .toString();

        var result = matcher.match(mudClient);
    }
}
