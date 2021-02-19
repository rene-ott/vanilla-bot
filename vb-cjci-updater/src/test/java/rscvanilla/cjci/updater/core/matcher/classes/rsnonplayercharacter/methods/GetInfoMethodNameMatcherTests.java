package rscvanilla.cjci.updater.core.matcher.classes.rsnonplayercharacter.methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class GetInfoMethodNameMatcherTests extends BaseTests {

    private GetInfoMethodNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new GetInfoMethodNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassRSNonPlayerCharacter();

        var match = new StringBuilder()
                .append("   public com.rsc.a.a.g ***cz***() {")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("cz"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
