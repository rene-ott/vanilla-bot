package rscvanilla.cjci.updater.utils;

import org.apache.commons.lang3.StringUtils;
import rscvanilla.cjci.updater.core.searcher.ClassMemberSearchResult;
import rscvanilla.cjci.model.contracts.WithClassMemberGroups;
import rscvanilla.cjci.model.contracts.WithClassMembers;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameMatchStatus;

import java.util.Scanner;

public class ClassMemberSearchResultUtil {

    public static String createOutputString(ClassMemberSearchResult resolveResult,
                                            WithClassMembers withClassMembers,
                                            WithClassMemberGroups withClassMemberGroups) {
        var sb = new StringBuilder();

        var oldFileMatch = resolveResult.getOldFileMatch();
        var newFileMatch = resolveResult.getNewFileMatch();

        var classMemberYamlKey = resolveResult.getClassMemberYamlKey();
        var className = AnnotationUtils.getYamlClassInfo(withClassMemberGroups.getClass());
        var groupName = AnnotationUtils.getYamlClassInfo(withClassMembers.getClass());

        sb.append(String.format("%n#====================>[%s].[%s].[%s] <===================#%n", className, groupName, classMemberYamlKey));
        sb.append(" * Match status:").append(System.lineSeparator());
        if (oldFileMatch != null) {
            sb.append("   - Old: ").append(oldFileMatch.getStatus()).append(System.lineSeparator());
        }
        sb.append("   - New: ").append(newFileMatch.getStatus()).append(System.lineSeparator());

        if (newFileMatch.getStatus() != ClassMemberNameMatchStatus.SINGLE) {
            return sb.toString();
        } else {
            sb.append(System.lineSeparator());
        }

        sb.append(" * Section:").append(System.lineSeparator());
        if (oldFileMatch != null) {
            sb.append("   - Old: ").append(System.lineSeparator());
            sb.append(transformToPaddedString(oldFileMatch.getSection())).append(System.lineSeparator());
        }
        sb.append("   - New:").append(System.lineSeparator());
        sb.append(transformToPaddedString(newFileMatch.getSection())).append(System.lineSeparator());

        sb.append(System.lineSeparator());
        sb.append(" * Field name: ").append(System.lineSeparator());
        if (oldFileMatch != null) {
            sb.append("   - Old: ").append(oldFileMatch.getMemberName()).append(System.lineSeparator());
        }
        sb.append("   - New: ").append(newFileMatch.getMemberName()).append(System.lineSeparator());

        return sb.toString();
    }

    private static String transformToPaddedString(String val) {
        if (val == null)
            return null;

        var sb = new StringBuilder();
        Scanner scanner = new Scanner(val);
        while (scanner.hasNextLine()) {
            var line = scanner.nextLine();

            sb.append(StringUtils.leftPad(line, line.length() + 5, ""));

            var hasNextLine = scanner.hasNextLine();
            if (hasNextLine) {
                sb.append(System.lineSeparator());
            }
        }
        scanner.close();

        return sb.toString();
    }
}
