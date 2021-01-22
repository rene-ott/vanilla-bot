package rscvanilla.hooker.core.services;

import org.slf4j.LoggerFactory;
import rscvanilla.hooker.services.ConsoleService;
import rscvanilla.hooker.core.searcher.classes.MudClientClassFieldSearcher;
import rscvanilla.hooker.services.SourceFileService;

import javax.inject.Inject;

public class MudClientClassMemberService extends ClassMemberBaseService<MudClientClassFieldSearcher> {

    @Inject
    public MudClientClassMemberService(MudClientClassFieldSearcher fieldSearcher,
                                       SourceFileService sourceFileService,
                                       ConsoleService consoleService) {
        super(fieldSearcher, sourceFileService, consoleService, LoggerFactory.getLogger(MudClientClassMemberService.class));
    }
}
