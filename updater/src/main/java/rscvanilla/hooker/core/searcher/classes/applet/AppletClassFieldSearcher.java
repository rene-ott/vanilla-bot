package rscvanilla.hooker.core.searcher.classes.applet;

import rscvanilla.hooker.core.matcher.classes.applet.AppletClassFieldNameMatcher;
import rscvanilla.hooker.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.Set;

public class AppletClassFieldSearcher extends ClassMemberBaseSearcher<AppletClassFieldNameMatcher> {

    @Inject
    public AppletClassFieldSearcher(Set<AppletClassFieldNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
