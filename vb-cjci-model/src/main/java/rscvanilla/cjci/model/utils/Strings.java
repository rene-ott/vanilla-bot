package rscvanilla.cjci.model.utils;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Strings {
    public static String separateRootKeyBlocksByNewLine(String yamlFileString) {
        var splitString = yamlFileString.lines().collect(Collectors.toList());

        var transformedSplitString = new ArrayList<String>();
        for (var i = 0; i < splitString.size()-1 ; i++) {

            // Skip first block
            if (i == 0) {
                transformedSplitString.add(splitString.get(i) + System.lineSeparator());
                continue;
            }

            var line = splitString.get(i + 1);
            if (!line.startsWith(" ")) {
                transformedSplitString.add(System.lineSeparator());
            }
            transformedSplitString.add(line + System.lineSeparator());
        }

        return String.join("", transformedSplitString);
    }
}
