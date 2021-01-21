package rscvanilla.hooker.console;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.hooker.matchers.FieldMatcherResultStatus;
import rscvanilla.hooker.resolvers.ClassFieldResolveResult;

import java.util.Scanner;

public class Console {

    private static final Logger logger = LoggerFactory.getLogger(Console.class);

    private String buildOutputString(ClassFieldResolveResult resolveResult, String qualifiedName) {
        var sb = new StringBuilder();

        var oldFile = resolveResult.getNewFileResult();
        var newFile = resolveResult.getOldFileResult();

        var classFieldName = resolveResult.getClassField().fieldName;
        var className = resolveResult.getClassName();

        sb.append(String.format("%n#====================>(%s)[%s].[%s] <===================#%n", qualifiedName, className, classFieldName));
        sb.append(" * Match status:").append(System.lineSeparator());
        if (oldFile != null) {
            sb.append("   - Old: ").append(oldFile.getStatus()).append(System.lineSeparator());
        }
        sb.append("   - New: ").append(newFile.getStatus()).append(System.lineSeparator());

        if (newFile.getStatus() != FieldMatcherResultStatus.SINGLE) {
            return sb.toString();
        } else {
            sb.append(System.lineSeparator());
        }

        sb.append(" * Section:").append(System.lineSeparator());
        if (oldFile != null) {
            sb.append("   - Old: ").append(System.lineSeparator());
            sb.append(transformToPaddedString(oldFile.getSection())).append(System.lineSeparator());
        }
        sb.append("   - New:").append(System.lineSeparator());
        sb.append(transformToPaddedString(newFile.getSection())).append(System.lineSeparator());

        sb.append(System.lineSeparator());
        sb.append(" * Field name: ").append(System.lineSeparator());
        if (oldFile != null) {
            sb.append("   - Old: ").append(oldFile.getFieldName()).append(System.lineSeparator());
        }
        sb.append("   - New: ").append(newFile.getFieldName()).append(System.lineSeparator());


        return sb.toString();
    }

    private String transformToPaddedString(String val) {
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

    public void printFieldResolveResult(ClassFieldResolveResult resolveResult, String qualifiedName) {

        var outputString = buildOutputString(resolveResult, qualifiedName);
        var isAccepted = resolveResult.getNewFileResult().getStatus() == FieldMatcherResultStatus.SINGLE;

        if (isAccepted) {
            logger.info(outputString);
            logger.info("Accepted field [{}].[{}] with value [{}].", resolveResult.getClassName(), resolveResult.getClassField().fieldName, resolveResult.getAcceptedFieldName());
        } else {
            logger.warn(outputString);
            logger.warn("Declined field [{}].[{}] value.", resolveResult.getClassName(), resolveResult.getClassField().fieldName);
        }

        pressEnterToContinue();
    }

    private void pressEnterToContinue()
    {
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {

        }
    }
}
