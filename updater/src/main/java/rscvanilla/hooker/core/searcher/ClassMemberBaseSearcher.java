package rscvanilla.hooker.core.searcher;

import rscvanilla.hooker.contracts.WithClassMembers;
import rscvanilla.hooker.core.matcher.ClassMemberNameMatcher;
import rscvanilla.hooker.infrastructure.AppException;
import rscvanilla.hooker.utils.AnnotationUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ClassMemberBaseSearcher<T extends ClassMemberNameMatcher> implements ClassMemberSearcher {

    protected final List<T> memberNameMatchers;
    protected List<String> classMemberYamlKeys;

    protected String newFileContent;
    protected String oldFileContent;

    public ClassMemberBaseSearcher(Set<T> memberNameMatchers) {
        this.memberNameMatchers = new ArrayList<>(memberNameMatchers);
    }

    public void setSearchableClassMembers(WithClassMembers classWithMembers) {
        this.classMemberYamlKeys = Arrays.stream(classWithMembers.getClass().getFields())
                .map(AnnotationUtils::getYamlClassMemberKey)
                .sorted()
                .collect(Collectors.toList());
    }

    public void setSearchableFileContent(String newFileContent, String oldFileContent) {
        this.newFileContent = newFileContent;
        this.oldFileContent = oldFileContent;
    }

    public List<ClassMemberSearchResult> searchMembers() {

        var resultList = new ArrayList<ClassMemberSearchResult>();

        for (var classMemberYamlKey : classMemberYamlKeys){
            var selectedMemberNameMatcher = getMemberNameMatcherByYamlKey(classMemberYamlKey);
            if (selectedMemberNameMatcher == null) {
                throw new AppException(String.format("Missing member name matcher with yaml key: [%s]", classMemberYamlKey));
            }

            var newFileMatch = selectedMemberNameMatcher.match(newFileContent);
            var oldFileMatch = oldFileContent == null ? null : selectedMemberNameMatcher.match(oldFileContent);

            resultList.add(new ClassMemberSearchResult(classMemberYamlKey, oldFileMatch, newFileMatch));
        }

        return resultList;
    }

    private ClassMemberNameMatcher getMemberNameMatcherByYamlKey(String name) {
        for (var fieldMatcher : memberNameMatchers) {
            if (AnnotationUtils.getYamlClassMemberKey(fieldMatcher.getClass()).equals(name)) {
                return fieldMatcher;
            }
        }

        return null;
    }
}
