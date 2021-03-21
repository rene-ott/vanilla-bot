package rscvanilla.cjci.updater.core.services;

import org.slf4j.LoggerFactory;
import rscvanilla.cjci.updater.core.searcher.classes.NullClassMethodSearcher;
import rscvanilla.cjci.updater.core.searcher.classes.applet.AppletClassFieldSearcher;
import rscvanilla.cjci.updater.core.searcher.classes.gameelements.GameElementsClassFieldSearcher;
import rscvanilla.cjci.updater.infrastructure.AppParameters;
import rscvanilla.cjci.updater.services.ConsoleService;
import rscvanilla.cjci.updater.services.SourceFileService;

import javax.inject.Inject;

public class GameElementsClassMemberService extends ClassMemberBaseService<GameElementsClassFieldSearcher, NullClassMethodSearcher> {

    @Inject
    protected GameElementsClassMemberService(GameElementsClassFieldSearcher fieldSearcher,
                                             NullClassMethodSearcher methodSearcher,
                                             SourceFileService sourceFileService,
                                             ConsoleService consoleService,
                                             AppParameters parameters) {
        super(fieldSearcher, methodSearcher, sourceFileService, consoleService, parameters, LoggerFactory.getLogger(GameElementsClassMemberService.class));
    }
}
