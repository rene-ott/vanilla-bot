package hooker.matchers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaseFieldMatcher implements FieldMatcher {

    protected Pattern pattern;

    public FieldMatcherResult match(String fileContent) {
        var result = new FieldMatcherResult();

        var matcher = pattern.matcher(fileContent);
        while(matcher.find()) {

            var fieldName = matcher.group("fieldName");
            if (fieldName != null) {
                result.addMatchedFieldName(fieldName);
            }

            result.addMatch(matcher.group(0));

            result.addMatchSection(getMatchesSection(matcher, fileContent));

        }
        return result;
    }

    private String getMatchesSection(Matcher matcher, String fileContent) {
        var startIndex = matcher.start();
        var endIndex = matcher.end();

        var calculatedStartIndex = startIndex <= 50 ? 0 : startIndex - 50;
        var calculatedEndIndex = endIndex + 50 >= fileContent.length()-1 ? fileContent.length()-1 : endIndex + 50;

        return fileContent.substring(calculatedStartIndex, calculatedEndIndex);
    }
}
