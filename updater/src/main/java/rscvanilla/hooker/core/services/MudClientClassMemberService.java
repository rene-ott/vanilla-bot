package rscvanilla.hooker.core.services;

import org.slf4j.LoggerFactory;
import rscvanilla.hooker.core.searcher.classes.mudclient.MudClientClassInterceptorSearcher;
import rscvanilla.hooker.core.searcher.classes.mudclient.MudClientClassMethodSearcher;
import rscvanilla.hooker.services.ConsoleService;
import rscvanilla.hooker.core.searcher.classes.mudclient.MudClientClassFieldSearcher;
import rscvanilla.hooker.services.SourceFileService;

import javax.inject.Inject;

public class MudClientClassMemberService extends ClassMemberBaseService<MudClientClassFieldSearcher,
                                                                        MudClientClassMethodSearcher,
                                                                        MudClientClassInterceptorSearcher> {

    @Inject
    public MudClientClassMemberService(MudClientClassFieldSearcher fieldSearcher,
                                       MudClientClassMethodSearcher methodSearcher,
                                       MudClientClassInterceptorSearcher interceptorSearcher,
                                       SourceFileService sourceFileService,
                                       ConsoleService consoleService) {
        super(fieldSearcher, methodSearcher, interceptorSearcher, sourceFileService, consoleService, LoggerFactory.getLogger(MudClientClassMemberService.class));
    }
}
