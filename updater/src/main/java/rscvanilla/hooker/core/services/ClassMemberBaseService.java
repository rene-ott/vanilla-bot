package rscvanilla.hooker.core.services;

import org.slf4j.Logger;
import rscvanilla.hooker.services.ConsoleService;
import rscvanilla.hooker.contracts.WithFields;
import rscvanilla.hooker.core.searcher.ClassMemberSearcher;
import rscvanilla.hooker.services.SourceFileService;
import rscvanilla.hooker.utils.AnnotationUtils;
import rscvanilla.hooker.utils.ClassMemberSearchResultUtil;

public class ClassMemberBaseService<TFieldSearcher extends ClassMemberSearcher> {

    protected TFieldSearcher fieldSearcher;

    protected final SourceFileService sourceFileService;
    protected final ConsoleService console;

    private final Logger logger;

    protected ClassMemberBaseService(TFieldSearcher fieldSearcher,
                                     SourceFileService sourceFileService,
                                     ConsoleService consoleService,
                                     Logger logger) {
        this.fieldSearcher = fieldSearcher;
        this.sourceFileService = sourceFileService;
        this.console = consoleService;
        this.logger = logger;
    }

    public void setClassMemberValuesTo(WithFields clazz) {
        var qualifiedName = clazz.getQualifiedName();

        var newFile = sourceFileService.readNewFile(qualifiedName);
        var oldFile = sourceFileService.readOldFile(qualifiedName);

        fieldSearcher.setSearchableFileContent(newFile, oldFile);
        fieldSearcher.setSearchableClassMembers(clazz.getFields());

        for (var searchResult : fieldSearcher.searchMembers()) {
            var outputString = ClassMemberSearchResultUtil.createOutputString(searchResult, clazz.getClass());

            if (searchResult.isSingleMatch()) {
                logger.info(System.lineSeparator() + outputString);
            } else {
                logger.warn(System.lineSeparator() + outputString);
            }
            console.pressEnterToContinue();
        }
    }
}
