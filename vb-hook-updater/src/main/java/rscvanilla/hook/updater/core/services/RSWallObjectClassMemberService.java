package rscvanilla.hook.updater.core.services;

import org.slf4j.LoggerFactory;
import rscvanilla.hook.updater.core.searcher.classes.NullClassInterceptorSearcher;
import rscvanilla.hook.updater.core.searcher.classes.NullClassMethodSearcher;
import rscvanilla.hook.updater.core.searcher.classes.rswallobject.RSWallObjectClassFieldSearcher;
import rscvanilla.hook.updater.infrastructure.AppParameters;
import rscvanilla.hook.updater.services.ConsoleService;
import rscvanilla.hook.updater.services.SourceFileService;

import javax.inject.Inject;

public class RSWallObjectClassMemberService extends ClassMemberBaseService<RSWallObjectClassFieldSearcher,
                                                                     NullClassMethodSearcher,
                                                                     NullClassInterceptorSearcher> {

    @Inject
    protected RSWallObjectClassMemberService(RSWallObjectClassFieldSearcher fieldSearcher,
                                             NullClassMethodSearcher methodSearcher,
                                             NullClassInterceptorSearcher interceptorSearcher,
                                             SourceFileService sourceFileService,
                                             ConsoleService consoleService,
                                             AppParameters parameters) {
        super(fieldSearcher, methodSearcher, interceptorSearcher, sourceFileService, consoleService, parameters, LoggerFactory.getLogger(MudClientClassMemberService.class));
    }
}
