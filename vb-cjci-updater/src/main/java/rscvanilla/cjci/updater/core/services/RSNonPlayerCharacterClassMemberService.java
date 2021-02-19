package rscvanilla.cjci.updater.core.services;

import org.slf4j.LoggerFactory;
import rscvanilla.cjci.updater.core.searcher.classes.NullClassFieldSearcher;
import rscvanilla.cjci.updater.core.searcher.classes.rsnonplayercharacter.RSNonPlayerCharacterClassMethodSearcher;
import rscvanilla.cjci.updater.infrastructure.AppParameters;
import rscvanilla.cjci.updater.services.ConsoleService;
import rscvanilla.cjci.updater.services.SourceFileService;

import javax.inject.Inject;

public class RSNonPlayerCharacterClassMemberService extends ClassMemberBaseService<NullClassFieldSearcher, RSNonPlayerCharacterClassMethodSearcher> {

    @Inject
    protected RSNonPlayerCharacterClassMemberService(NullClassFieldSearcher fieldSearcher,
                                                     RSNonPlayerCharacterClassMethodSearcher methodSearcher,
                                                     SourceFileService sourceFileService,
                                                     ConsoleService consoleService,
                                                     AppParameters parameters) {
        super(fieldSearcher, methodSearcher, sourceFileService, consoleService, parameters, LoggerFactory.getLogger(RSNonPlayerCharacterClassMemberService.class));
    }
}
