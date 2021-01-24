package rscvanilla.hook.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.hook.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class IsBankVisibleFieldNameMatcherTests extends BaseTests {

    private IsBankVisibleFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new IsBankVisibleFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   private boolean qT;").append(lineSeparator)
                .append("   private boolean qU;").append(lineSeparator)
                .append("   public boolean ***qV***;").append(lineSeparator)
                .append("   private boolean qW;").append(lineSeparator)
                .append("   private boolean qX;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("qV"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
