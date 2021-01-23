package rscvanilla.hook.updater.core.searcher.classes.applet;

import rscvanilla.hook.updater.core.matcher.classes.applet.AppletClassFieldNameMatcher;
import rscvanilla.hook.updater.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.Set;

public class AppletClassFieldSearcher extends ClassMemberBaseSearcher<AppletClassFieldNameMatcher> {

    @Inject
    public AppletClassFieldSearcher(Set<AppletClassFieldNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
