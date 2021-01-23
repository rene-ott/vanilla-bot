package rscvanilla.hooker.core.services;

import org.slf4j.LoggerFactory;
import rscvanilla.hooker.core.searcher.classes.NullClassInterceptorSearcher;
import rscvanilla.hooker.core.searcher.classes.NullClassMethodSearcher;
import rscvanilla.hooker.services.ConsoleService;
import rscvanilla.hooker.core.searcher.classes.applet.AppletClassFieldSearcher;
import rscvanilla.hooker.services.SourceFileService;

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
