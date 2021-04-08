package rscvanilla.cjci.updater.core.services;

import org.slf4j.LoggerFactory;
import rscvanilla.cjci.updater.core.searcher.classes.NullClassMethodSearcher;
import rscvanilla.cjci.updater.core.searcher.classes.shopinterface.ShopInterfaceClassFieldSearcher;
import rscvanilla.cjci.updater.infrastructure.AppParameters;
import rscvanilla.cjci.updater.services.ConsoleService;
import rscvanilla.cjci.updater.services.SourceFileService;

import javax.inject.Inject;

public class ShopInterfaceClassMemberService extends ClassMemberBaseService<ShopInterfaceClassFieldSearcher, NullClassMethodSearcher> {

    @Inject
    protected ShopInterfaceClassMemberService(ShopInterfaceClassFieldSearcher fieldSearcher,
                                              NullClassMethodSearcher methodSearcher,
                                              SourceFileService sourceFileService,
                                              ConsoleService consoleService,
                                              AppParameters parameters) {
        super(fieldSearcher, methodSearcher, sourceFileService, consoleService, parameters, LoggerFactory.getLogger(ShopInterfaceClassFieldSearcher.class));
    }
}
