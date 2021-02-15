package rscvanilla.cjci.updater.core.services;

import org.slf4j.LoggerFactory;
import rscvanilla.cjci.updater.core.searcher.classes.NullClassFieldSearcher;
import rscvanilla.cjci.updater.core.searcher.classes.NullClassInterceptorSearcher;
import rscvanilla.cjci.updater.core.searcher.classes.packetbuilderbase.PacketBuilderBaseClassMethodSearcher;
import rscvanilla.cjci.updater.infrastructure.AppParameters;
import rscvanilla.cjci.updater.services.ConsoleService;
import rscvanilla.cjci.updater.services.SourceFileService;

import javax.inject.Inject;

public class PacketBuilderBaseClassMemberService extends ClassMemberBaseService<NullClassFieldSearcher,
    PacketBuilderBaseClassMethodSearcher,
    NullClassInterceptorSearcher> {

    @Inject
    public PacketBuilderBaseClassMemberService(NullClassFieldSearcher fieldSearcher,
                                               PacketBuilderBaseClassMethodSearcher methodSearcher,
                                               NullClassInterceptorSearcher interceptorSearcher,
                                               SourceFileService sourceFileService,
                                               ConsoleService consoleService,
                                               AppParameters parameters) {
        super(fieldSearcher, methodSearcher, interceptorSearcher, sourceFileService, consoleService, parameters, LoggerFactory.getLogger(PacketBuilderBaseClassMemberService.class));
    }
}
