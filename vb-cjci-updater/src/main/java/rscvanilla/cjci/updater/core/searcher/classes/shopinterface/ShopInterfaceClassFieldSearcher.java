package rscvanilla.cjci.updater.core.searcher.classes.shopinterface;

import rscvanilla.cjci.updater.core.matcher.classes.shopinterface.ShopInterfaceClassFieldNameMatcher;
import rscvanilla.cjci.updater.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.Set;

public class ShopInterfaceClassFieldSearcher extends ClassMemberBaseSearcher<ShopInterfaceClassFieldNameMatcher> {

    @Inject
    public ShopInterfaceClassFieldSearcher(Set<ShopInterfaceClassFieldNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
