package rscvanilla.cjci.updater.core.services;

import org.slf4j.LoggerFactory;
import rscvanilla.cjci.updater.core.searcher.classes.NullClassInterceptorSearcher;
import rscvanilla.cjci.updater.core.searcher.classes.NullClassMethodSearcher;
import rscvanilla.cjci.updater.core.searcher.classes.applet.AppletClassFieldSearcher;
import rscvanilla.cjci.updater.infrastructure.AppParameters;
import rscvanilla.cjci.updater.services.ConsoleService;
import rscvanilla.cjci.updater.services.SourceFileService;

import javax.inject.Inject;

public class AppletClassMemberService extends ClassMemberBaseService<AppletClassFieldSearcher,
    NullClassMethodSearcher,
    NullClassInterceptorSearcher> {

    @Inject
    protected AppletClassMemberService(AppletClassFieldSearcher fieldSearcher,
                                       NullClassMethodSearcher methodSearcher,
                                       NullClassInterceptorSearcher interceptorSearcher,
                                       SourceFileService sourceFileService,
                                       ConsoleService consoleService,
                                       AppParameters parameters) {
        super(fieldSearcher, methodSearcher, interceptorSearcher, sourceFileService, consoleService, parameters, LoggerFactory.getLogger(MudClientClassMemberService.class));
    }
}
