package rscvanilla.cjci.updater.core.services;

import org.slf4j.LoggerFactory;
import rscvanilla.cjci.updater.core.searcher.classes.NullClassFieldSearcher;
import rscvanilla.cjci.updater.core.searcher.classes.panel.PanelClassMethodSearcher;
import rscvanilla.cjci.updater.infrastructure.AppParameters;
import rscvanilla.cjci.updater.services.ConsoleService;
import rscvanilla.cjci.updater.services.SourceFileService;

import javax.inject.Inject;

public class PanelClassMemberService extends ClassMemberBaseService<NullClassFieldSearcher, PanelClassMethodSearcher> {

    @Inject
    protected PanelClassMemberService(NullClassFieldSearcher fieldSearcher,
                                      PanelClassMethodSearcher methodSearcher,
                                      SourceFileService sourceFileService,
                                      ConsoleService consoleService,
                                      AppParameters parameters) {
        super(fieldSearcher, methodSearcher, sourceFileService, consoleService, parameters, LoggerFactory.getLogger(MudClientClassMemberService.class));
    }
}
