package rscvanilla.hooker.core.services;

import org.slf4j.LoggerFactory;
import rscvanilla.hooker.services.ConsoleService;
import rscvanilla.hooker.core.searcher.classes.AppletClassFieldSearcher;
import rscvanilla.hooker.services.SourceFileService;

import javax.inject.Inject;

public class AppletClassMemberService extends ClassMemberBaseService<AppletClassFieldSearcher>{

    @Inject
    protected AppletClassMemberService(AppletClassFieldSearcher fieldSearcher,
                                       SourceFileService sourceFileService,
                                       ConsoleService consoleService) {
        super(fieldSearcher, sourceFileService, consoleService, LoggerFactory.getLogger(MudClientClassMemberService.class));
    }
}
