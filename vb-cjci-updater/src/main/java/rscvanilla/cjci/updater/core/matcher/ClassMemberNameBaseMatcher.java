package rscvanilla.cjci.updater.core.matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassMemberNameBaseMatcher implements ClassMemberNameMatcher {

    protected Pattern pattern;

    public ClassMemberNameMatch match(String fileContent) {
        var result = new ClassMemberNameMatch();

        var matcher = pattern.matcher(fileContent);

        while(matcher.find()) {
            if (result.getStatus() == ClassMemberNameMatchStatus.MISSING) {
                var fieldName = matcher.group("fieldName");
                var pre = matcher.group("pre");
                var post = matcher.group("post");
                var match = matcher.group(0);

                var section = getSection(matcher, fileContent);
                var transformedMatch = pre + transformFieldName(fieldName) + post;
                var transformedSection = section.replace(match, transformedMatch);

                result.setValues(fieldName, transformedMatch, transformedSection);
                result.setStatus(ClassMemberNameMatchStatus.SINGLE);
            } else if (result.getStatus() == ClassMemberNameMatchStatus.SINGLE) {
                result.setStatus(ClassMemberNameMatchStatus.MULTIPLE);
                result.setValues(null, null, null);
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
