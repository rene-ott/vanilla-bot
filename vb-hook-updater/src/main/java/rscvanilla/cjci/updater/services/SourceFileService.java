package rscvanilla.cjci.updater.services;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;

import javax.inject.Inject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class SourceFileService {

    private final OutputDirectoryService outputDirectoryService;

    @Inject
    public SourceFileService(OutputDirectoryService outputDirectoryService) {
        this.outputDirectoryService = outputDirectoryService;
    }

    public String readOldFile(String qualifiedClassName) {
        return readFile(outputDirectoryService.getTempOldDirPath(), qualifiedClassName);
    }

    public String readNewFile(String qualifiedClassName) {
        return readFile(outputDirectoryService.getTempNewDirPath(), qualifiedClassName);
    }

    // TODO Exception handling
    private String readFile(String tempDirPath, String qualifiedClassName) {

        var packageAndClassName = getPackageAndClassNameFromQName(qualifiedClassName);
        var packageName = packageAndClassName.getLeft();
        var className = packageAndClassName.getRight();

        var classFileName = className + ".java";
        var packageDirNames = getPackageDirNames(packageName);

        var path = Path.of(tempDirPath, ArrayUtils.addAll(packageDirNames, classFileName));

        try {
            return Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private static String[] getPackageDirNames(String packageName) {
        return packageName.split("\\.");
    }

    //TODO custom exceptions
    private static Pair<String, String> getPackageAndClassNameFromQName(String qualifiedName) {
        var reversedQualifiedName = StringUtils.reverse(qualifiedName);

        var pattern = Pattern.compile("(?<className>[a-z])\\.(?<packageName>[a-z.]+)");
        var matcher = pattern.matcher(reversedQualifiedName);

        String className = null;
        String packageName = null;
        while(matcher.find()) {
            className = matcher.group("className");
            if (className == null) {
                throw new RuntimeException();
            }

            packageName = matcher.group("packageName");
            if (packageName == null) {
                throw new RuntimeException();
            }
        }

        return Pair.of(StringUtils.reverse(packageName), className);
    }
}
