package hooker.matchers;

import java.util.ArrayList;
import java.util.List;

public class FieldMatcherResult {

    private final List<String> matches;
    private final List<String> matchesSections;
    private final List<String> matchesFieldNames;

    public FieldMatcherResult() {
        matches = new ArrayList<>();
        matchesFieldNames = new ArrayList<>();
        matchesSections = new ArrayList<>();
    }

    public void addMatch(String match) {
        matches.add(match);
    }

    public void addMatchSection(String matchSection) {
        matchesSections.add(matchSection);
    }

    public void addMatchedFieldName(String fieldName) {
        matchesFieldNames.add(fieldName);
    }

    public boolean isSingleMatch() {
        return matches.size() == 1 && matchesSections.size() == 1 && matchesFieldNames.size() == 1;
    }

    public String getMatchedFieldName() {
        return matchesFieldNames.get(0);
    }

    public String getMatch() {
        return matches.get(0);
    }

    public String getMatchedSection() {
        return matchesSections.get(0);
    }
}
