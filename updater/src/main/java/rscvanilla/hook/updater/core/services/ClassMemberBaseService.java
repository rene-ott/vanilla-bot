package rscvanilla.hook.updater.core.services;

import org.slf4j.Logger;
import rscvanilla.hook.model.contracts.*;
import rscvanilla.hook.updater.core.searcher.ClassMemberSearchResult;
import rscvanilla.hook.updater.infrastructure.AppException;
import rscvanilla.hook.updater.infrastructure.AppParameters;
import rscvanilla.hook.updater.services.ConsoleService;
import rscvanilla.hook.updater.core.searcher.ClassMemberSearcher;
import rscvanilla.hook.updater.services.SourceFileService;
import rscvanilla.hook.updater.utils.AnnotationUtils;
import rscvanilla.hook.updater.utils.ClassMemberSearchResultUtil;

import java.util.Arrays;

public class ClassMemberBaseService<TFieldSearcher extends ClassMemberSearcher,
                                    TMethodSearcher extends ClassMemberSearcher,
                                    TInterceptorSearcher extends ClassMemberSearcher> {

    protected TFieldSearcher fieldSearcher;
    protected TMethodSearcher methodSearcher;
    protected TInterceptorSearcher interceptorSearcher;

    protected final SourceFileService sourceFileService;
    protected final ConsoleService console;
    protected final AppParameters parameters;

    private final Logger logger;

    protected ClassMemberBaseService(TFieldSearcher fieldSearcher,
                                     TMethodSearcher methodSearcher,
                                     TInterceptorSearcher interceptorSearcher,
                                     SourceFileService sourceFileService,
                                     ConsoleService consoleService,
                                     AppParameters parameters,
                                     Logger logger) {
        this.fieldSearcher = fieldSearcher;
        this.methodSearcher = methodSearcher;
        this.interceptorSearcher = interceptorSearcher;
        this.sourceFileService = sourceFileService;
        this.console = consoleService;
        this.parameters = parameters;
        this.logger = logger;
    }

    public void setValuesToClassMembers(WithClassMemberGroups clazz) {
        var qualifiedName = clazz.getQualifiedName();

        var newFile = sourceFileService.readNewFile(qualifiedName);
        var oldFile = sourceFileService.readOldFile(qualifiedName);

        if (clazz instanceof WithFieldGroup) {
            setValuesToClassMembers(((WithFieldGroup)clazz).getFields(), clazz, fieldSearcher, newFile, oldFile);
        }

        if (clazz instanceof WithMethodGroup) {
            setValuesToClassMembers(((WithMethodGroup)clazz).getMethods(), clazz, methodSearcher, newFile, oldFile);
        }

        if (clazz instanceof WithInterceptorGroup) {
            setValuesToClassMembers(((WithInterceptorGroup) clazz).getInterceptors(),clazz, interceptorSearcher, newFile, oldFile);
        }
    }

    private void setValuesToClassMembers(WithClassMembers withClassMembers,
                                         WithClassMemberGroups withClassMemberGroups,
                                         ClassMemberSearcher classMemberSearcher,
                                         String newFileContent,
                                         String oldFileContent) {

        classMemberSearcher.setSearchableFileContent(newFileContent, oldFileContent);
        classMemberSearcher.setSearchableClassMembers(withClassMembers);

        if (!parameters.skipVerification) {
            console.clear();
        }

        for (var searchResult : classMemberSearcher.searchMembers()) {
            var outputString = ClassMemberSearchResultUtil.createOutputString(searchResult, withClassMembers, withClassMemberGroups);

            if (searchResult.isSingleMatch()) {
                logger.info(outputString);
                setValueToClassMember(withClassMembers, searchResult);
            } else {
                logger.warn(outputString);
            }

            if (!parameters.skipVerification) {
                console.pressEnterToContinue();
                console.clear();
            }
        }
    }

    // TODO Better exception handling
    private void setValueToClassMember(WithClassMembers withClassMembers, ClassMemberSearchResult searchResult) {
        var field = Arrays.stream(withClassMembers.getClass().getFields())
                .filter(it -> AnnotationUtils.getYamlClassMemberKey(it).equals(searchResult.getClassMemberYamlKey()))
                .findFirst()
                .orElseThrow(IllegalStateException::new);

        try {
            field.set(withClassMembers, searchResult.getNewFileMatch().getMemberName());
        } catch (IllegalAccessException e) {
            throw new AppException("Can't set field value", e);
        }
    }
}
