package rscvanilla.hooker.utils;

import rscvanilla.hooker.annotations.YamlClassInfo;
import rscvanilla.hooker.annotations.YamlClassMemberKey;

import java.lang.reflect.Field;

public class AnnotationUtils {
    public static String getYamlClassMemberKey(Field field) {
        return field.getAnnotation(YamlClassMemberKey.class).value();
    }

    public static String getYamlClassMemberKey(Class<?> clazz) {
        return clazz.getAnnotation(YamlClassMemberKey.class).value();
    }

    public static String getYamlClassInfo(Class<?> clazz) {
        return clazz.getAnnotation(YamlClassInfo.class).value();
    }
}
