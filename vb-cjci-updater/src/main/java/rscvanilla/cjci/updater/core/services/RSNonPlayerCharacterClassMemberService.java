package rscvanilla.cjci.updater.core.services;

import org.slf4j.LoggerFactory;
import rscvanilla.cjci.updater.core.searcher.classes.NullClassFieldSearcher;
import rscvanilla.cjci.updater.core.searcher.classes.NullClassInterceptorSearcher;
import rscvanilla.cjci.updater.core.searcher.classes.rsnonplayercharacter.RSNonPlayerCharacterClassMethodSearcher;
import rscvanilla.cjci.updater.infrastructure.AppParameters;
import rscvanilla.cjci.updater.services.ConsoleService;
import rscvanilla.cjci.updater.services.SourceFileService;

import javax.inject.Inject;

public class RSNonPlayerCharacterClassMemberService extends ClassMemberBaseService<
    NullClassFieldSearcher,
    RSNonPlayerCharacterClassMethodSearcher,
    NullClassInterceptorSearcher> {

    @Inject
    protected RSNonPlayerCharacterClassMemberService(NullClassFieldSearcher fieldSearcher,
                                                     RSNonPlayerCharacterClassMethodSearcher methodSearcher,
                                                     NullClassInterceptorSearcher interceptorSearcher,
                                                     SourceFileService sourceFileService,
                                                     ConsoleService consoleService,
                                                     AppParameters parameters) {
        super(fieldSearcher, methodSearcher, interceptorSearcher, sourceFileService, consoleService, parameters, LoggerFactory.getLogger(RSNonPlayerCharacterClassMemberService.class));
    }
}
