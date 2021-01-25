package rscvanilla.hook.updater.utils;

import rscvanilla.hook.model.annotations.YamlClassInfo;
import rscvanilla.hook.model.annotations.YamlClassMemberKey;

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
