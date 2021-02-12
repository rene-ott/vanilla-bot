package rscvanilla.hook.updater.core.matcher.classes.rsplayercharacter.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.hook.updater.core.matcher.classes.BaseTests;
import rscvanilla.hook.updater.core.matcher.classes.rsentity.fields.IdFieldNameMatcher;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class NameFieldNameMatcherTests extends BaseTests {

    private NameFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new NameFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassRSPlayerCharacter();

        var match = new StringBuilder()
            .append("public class k extends i {").append(lineSeparator)
            .append("   public String ***mU***;").append(lineSeparator)
            .append("   public int mV = 0;").append(lineSeparator)
            .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("mU"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
