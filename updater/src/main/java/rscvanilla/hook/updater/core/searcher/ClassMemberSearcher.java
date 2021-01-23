package rscvanilla.hook.updater.core.searcher;

import rscvanilla.hook.model.contracts.WithClassMembers;

import java.util.List;

public interface ClassMemberSearcher {
    void setSearchableClassMembers(WithClassMembers classWithMembers);
    void setSearchableFileContent(String newFileContent, String oldFileContent);
    List<ClassMemberSearchResult> searchMembers();
}
