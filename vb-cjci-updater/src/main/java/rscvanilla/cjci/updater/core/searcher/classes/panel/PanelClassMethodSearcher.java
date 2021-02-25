package rscvanilla.cjci.updater.core.searcher.classes.panel;

import rscvanilla.cjci.updater.core.matcher.classes.panel.PanelClassMethodNameMatcher;
import rscvanilla.cjci.updater.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.Set;

public class PanelClassMethodSearcher extends ClassMemberBaseSearcher<PanelClassMethodNameMatcher> {

    @Inject
    public PanelClassMethodSearcher(Set<PanelClassMethodNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
