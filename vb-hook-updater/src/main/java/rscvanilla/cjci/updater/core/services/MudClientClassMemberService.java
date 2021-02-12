package rscvanilla.cjci.updater.core.services;

import org.slf4j.LoggerFactory;
import rscvanilla.cjci.updater.core.searcher.classes.mudclient.MudClientClassFieldSearcher;
import rscvanilla.cjci.updater.core.searcher.classes.mudclient.MudClientClassInterceptorSearcher;
import rscvanilla.cjci.updater.core.searcher.classes.mudclient.MudClientClassMethodSearcher;
import rscvanilla.cjci.updater.infrastructure.AppParameters;
import rscvanilla.cjci.updater.services.ConsoleService;
import rscvanilla.cjci.updater.services.SourceFileService;

import javax.inject.Inject;

public class MudClientClassMemberService extends ClassMemberBaseService<MudClientClassFieldSearcher,
                                                                        MudClientClassMethodSearcher,
    MudClientClassInterceptorSearcher> {

    @Inject
    public MudClientClassMemberService(MudClientClassFieldSearcher fieldSearcher,
                                       MudClientClassMethodSearcher methodSearcher,
                                       MudClientClassInterceptorSearcher interceptorSearcher,
                                       SourceFileService sourceFileService,
                                       ConsoleService consoleService,
                                       AppParameters parameters) {
        super(fieldSearcher, methodSearcher, interceptorSearcher, sourceFileService, consoleService, parameters, LoggerFactory.getLogger(MudClientClassMemberService.class));
    }
}
