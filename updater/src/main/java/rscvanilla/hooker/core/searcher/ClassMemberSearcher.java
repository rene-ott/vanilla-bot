package rscvanilla.hooker.core.searcher;

import rscvanilla.hooker.contracts.WithClassMembers;

import java.util.List;

public interface ClassMemberSearcher {
    void setSearchableClassMembers(WithClassMembers classWithMembers);
    void setSearchableFileContent(String newFileContent, String oldFileContent);
    List<ClassMemberSearchResult> searchMembers();
}
