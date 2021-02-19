package rscvanilla.cjci.updater.core.services;

import org.slf4j.LoggerFactory;
import rscvanilla.cjci.updater.core.searcher.classes.NullClassMethodSearcher;
import rscvanilla.cjci.updater.infrastructure.AppParameters;
import rscvanilla.cjci.updater.services.ConsoleService;
import rscvanilla.cjci.updater.services.SourceFileService;
import rscvanilla.cjci.updater.core.searcher.classes.rswallobject.RSWallObjectClassFieldSearcher;

import javax.inject.Inject;

public class RSWallObjectClassMemberService extends ClassMemberBaseService<RSWallObjectClassFieldSearcher, NullClassMethodSearcher> {

    @Inject
    protected RSWallObjectClassMemberService(RSWallObjectClassFieldSearcher fieldSearcher,
                                             NullClassMethodSearcher methodSearcher,
                                             SourceFileService sourceFileService,
                                             ConsoleService consoleService,
                                             AppParameters parameters) {
        super(fieldSearcher, methodSearcher, sourceFileService, consoleService, parameters, LoggerFactory.getLogger(MudClientClassMemberService.class));
    }
}
