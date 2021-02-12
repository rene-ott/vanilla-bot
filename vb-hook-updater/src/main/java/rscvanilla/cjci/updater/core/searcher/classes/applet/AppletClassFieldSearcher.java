package rscvanilla.cjci.updater.core.searcher.classes.applet;

import rscvanilla.cjci.updater.core.searcher.ClassMemberBaseSearcher;
import rscvanilla.cjci.updater.core.matcher.classes.applet.AppletClassFieldNameMatcher;

import javax.inject.Inject;
import java.util.Set;

public class AppletClassFieldSearcher extends ClassMemberBaseSearcher<AppletClassFieldNameMatcher> {

    @Inject
    public AppletClassFieldSearcher(Set<AppletClassFieldNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
