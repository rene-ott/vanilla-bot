package rscvanilla.hooker.matchers;

public interface FieldMatcher {
    FieldMatcherResult match(String fileContent);
}
