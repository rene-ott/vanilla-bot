package rscvanilla.hook.updater.core.services;

import org.slf4j.LoggerFactory;
import rscvanilla.hook.updater.core.searcher.classes.NullClassInterceptorSearcher;
import rscvanilla.hook.updater.core.searcher.classes.NullClassMethodSearcher;
import rscvanilla.hook.updater.services.ConsoleService;
import rscvanilla.hook.updater.core.searcher.classes.applet.AppletClassFieldSearcher;
import rscvanilla.hook.updater.services.SourceFileService;

import javax.inject.Inject;

public class AppletClassMemberService extends ClassMemberBaseService<AppletClassFieldSearcher,
                                                                     NullClassMethodSearcher,
                                                                     NullClassInterceptorSearcher> {

    @Inject
    protected AppletClassMemberService(AppletClassFieldSearcher fieldSearcher,
                                       NullClassMethodSearcher methodSearcher,
                                       NullClassInterceptorSearcher interceptorSearcher,
                                       SourceFileService sourceFileService,
                                       ConsoleService consoleService) {
        super(fieldSearcher, methodSearcher, interceptorSearcher, sourceFileService, consoleService, LoggerFactory.getLogger(MudClientClassMemberService.class));
    }
}
