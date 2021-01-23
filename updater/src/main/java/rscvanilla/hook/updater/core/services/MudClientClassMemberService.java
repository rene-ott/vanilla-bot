package rscvanilla.hook.updater.core.services;

import org.slf4j.LoggerFactory;
import rscvanilla.hook.updater.core.searcher.classes.mudclient.MudClientClassInterceptorSearcher;
import rscvanilla.hook.updater.core.searcher.classes.mudclient.MudClientClassMethodSearcher;
import rscvanilla.hook.updater.infrastructure.AppParameters;
import rscvanilla.hook.updater.services.ConsoleService;
import rscvanilla.hook.updater.core.searcher.classes.mudclient.MudClientClassFieldSearcher;
import rscvanilla.hook.updater.services.SourceFileService;

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
