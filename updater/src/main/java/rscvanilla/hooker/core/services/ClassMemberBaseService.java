package rscvanilla.hooker.core.services;

import org.slf4j.Logger;
import rscvanilla.hooker.contracts.WithClassMemberGroups;
import rscvanilla.hooker.contracts.WithClassMembers;
import rscvanilla.hooker.services.ConsoleService;
import rscvanilla.hooker.contracts.WithFieldGroup;
import rscvanilla.hooker.core.searcher.ClassMemberSearcher;
import rscvanilla.hooker.services.SourceFileService;
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

    public void setClassMemberValuesTo(WithClassMemberGroups clazz) {
        var qualifiedName = clazz.getQualifiedName();

        var newFile = sourceFileService.readNewFile(qualifiedName);
        var oldFile = sourceFileService.readOldFile(qualifiedName);

        if (clazz instanceof WithFieldGroup) {
            setClassMemberValuesTo(clazz, ((WithFieldGroup)clazz).getFields(), fieldSearcher, newFile, oldFile);
        }
    }

    private void setClassMemberValuesTo(WithClassMemberGroups clazz,
                                        WithClassMembers classMembers,
                                        ClassMemberSearcher classMemberSearcher,
                                        String newFileContent,
                                        String oldFileContent) {

        fieldSearcher.setSearchableFileContent(newFileContent, oldFileContent);
        fieldSearcher.setSearchableClassMembers(classMembers);

        for (var searchResult : classMemberSearcher.searchMembers()) {
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
