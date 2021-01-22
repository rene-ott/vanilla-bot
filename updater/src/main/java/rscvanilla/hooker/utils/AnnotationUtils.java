package rscvanilla.hooker.utils;

import rscvanilla.hooker.annotations.YamlClassKey;
import rscvanilla.hooker.annotations.YamlClassMemberKey;

import java.lang.reflect.Field;

public class AnnotationUtils {
    public static String getClassMemberYamlKey(Field field) {
        return field.getAnnotation(YamlClassMemberKey.class).value();
    }

    public static String getClassMemberYamlKey(Class<?> clazz) {
        return clazz.getAnnotation(YamlClassMemberKey.class).value();
    }

    public static String getClassYamlKey(Class<?> clazz) {
        return clazz.getAnnotation(YamlClassKey.class).value();
    }
}
