package rscvanilla.cjci.updater.core.searcher;

import rscvanilla.cjci.model.contracts.WithClassMembers;

import java.util.List;

public interface ClassMemberSearcher {
    void setSearchableClassMembers(WithClassMembers classWithMembers);
    void setSearchableFileContent(String newFileContent, String oldFileContent);
    List<ClassMemberSearchResult> searchMembers();
}
