package hooker.matchers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FieldMatcherBase implements FieldMatcher {

    protected Pattern pattern;

    public FieldMatcherResult match(String fileContent) {
        var result = new FieldMatcherResult();

        var matcher = pattern.matcher(fileContent);

        while(matcher.find()) {
            if (result.getStatus() == FieldMatcherResultStatus.MISSING) {
                var fieldName = matcher.group("fieldName");
                var pre = matcher.group("pre");
                var post = matcher.group("post");
                var match = matcher.group(0);

                var section = getSection(matcher, fileContent);
                var transformedMatch = pre + transformFieldName(fieldName) + post;
                var transformedSection = section.replace(match, transformedMatch);

                result.setValues(fieldName, transformedMatch, transformedSection);
                result.setStatus(FieldMatcherResultStatus.SINGLE);
            } else if (result.getStatus() == FieldMatcherResultStatus.SINGLE) {
                result.setStatus(FieldMatcherResultStatus.MULTIPLE);
            }
        }

        return result;
    }

    private String transformFieldName(String fieldName) {
        return "***" + fieldName + "***";
    }

    private String getSection(Matcher matcher, String fileContent) {
        var startIndex = matcher.start();
        var endIndex = matcher.end();

        var calculatedStartIndex = startIndex <= 50 ? 0 : startIndex - 50;
        var calculatedEndIndex = endIndex + 50 >= fileContent.length()-1 ? fileContent.length()-1 : endIndex + 50;

        return fileContent.substring(calculatedStartIndex, calculatedEndIndex);
    }
}
