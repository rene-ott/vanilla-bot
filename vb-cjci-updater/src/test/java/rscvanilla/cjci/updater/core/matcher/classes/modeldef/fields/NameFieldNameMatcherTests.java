package rscvanilla.cjci.updater.core.matcher.classes.modeldef.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

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
        var mudClient = readModelDef();

        var match = new StringBuilder()
                .append("public abstract class d {").append(lineSeparator)
                .append("   public String ***aY***;").append(lineSeparator)
                .append("   public String bn;").append(lineSeparator)
                .append("   public int bo;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("aY"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
