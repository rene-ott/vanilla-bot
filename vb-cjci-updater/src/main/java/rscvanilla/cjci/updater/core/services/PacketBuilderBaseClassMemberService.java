package rscvanilla.cjci.updater.core.services;

import org.slf4j.LoggerFactory;
import rscvanilla.cjci.updater.core.searcher.classes.packetbuilderbase.PacketBuilderBaseClassFieldSearcher;
import rscvanilla.cjci.updater.core.searcher.classes.packetbuilderbase.PacketBuilderBaseClassMethodSearcher;
import rscvanilla.cjci.updater.infrastructure.AppParameters;
import rscvanilla.cjci.updater.services.ConsoleService;
import rscvanilla.cjci.updater.services.SourceFileService;

import javax.inject.Inject;

public class PacketBuilderBaseClassMemberService extends ClassMemberBaseService<PacketBuilderBaseClassFieldSearcher, PacketBuilderBaseClassMethodSearcher> {

    @Inject
    public PacketBuilderBaseClassMemberService(PacketBuilderBaseClassFieldSearcher fieldSearcher,
                                               PacketBuilderBaseClassMethodSearcher methodSearcher,
                                               SourceFileService sourceFileService,
                                               ConsoleService consoleService,
                                               AppParameters parameters) {
        super(fieldSearcher, methodSearcher, sourceFileService, consoleService, parameters, LoggerFactory.getLogger(PacketBuilderBaseClassMemberService.class));
    }
}
