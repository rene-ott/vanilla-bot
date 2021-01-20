package rscvanilla.hooker.console;

import rscvanilla.hooker.matchers.FieldMatcherResultStatus;
import rscvanilla.hooker.resolvers.ClassFieldResolveResult;

public class Console {

    public void printClassInfo(String classKey, String qualifiedName) {
        System.out.printf("###############> [%s - %s ] <###############%n", classKey, qualifiedName);
    }

    public void printClassFieldsInfo(ClassFieldResolveResult resolveResult) {
        var oldFile = resolveResult.getNewFileResult();
        var newFile = resolveResult.getOldFileResult();
        System.out.printf("====================> [%s] <===================%n", resolveResult.getClassField().key);
        System.out.println("NEW FILE: " + newFile.getStatus());
        System.out.println("OLD FILE: " + (oldFile == null ? "null" : oldFile.getStatus()));

        System.out.println("-----------------> SECTION <------------------");
        System.out.println("[NEW FILE]");
        System.out.println(newFile.getSection());
        System.out.println("[OLD FILE]");
        System.out.println(oldFile == null ? "null" : oldFile.getSection());
        System.out.println();

        System.out.println("-----------------> MATCH <------------------");
        System.out.println("[NEW FILE]");
        System.out.println(newFile.getMatch());
        System.out.println("[OLD FILE]");
        System.out.println(oldFile == null ? "null" : oldFile.getMatch());
        System.out.println();

        System.out.println("-----------------> FIELD <------------------");
        System.out.println("[NEW FILE]");
        System.out.println(newFile.getFieldName());
        System.out.println("[OLD FILE]");
        System.out.println(oldFile == null ? "null" : oldFile.getFieldName());
        System.out.println();

        pressEnterToContinue(
            newFile.getFieldName(),
            resolveResult.getClassField().key,
            newFile.getStatus() == FieldMatcherResultStatus.SINGLE
        );
    }

    private void pressEnterToContinue(String fieldName, String key, boolean isAccepted)
    {
        var fieldNameValue = fieldName == null ? "" : String.format("[%s]", fieldName);
        System.out.println((isAccepted ? "Accepted " : "Declined ") + "field name " + fieldNameValue  + " for key [" +key + "].");
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
