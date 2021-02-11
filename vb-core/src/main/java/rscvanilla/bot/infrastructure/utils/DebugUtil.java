package rscvanilla.bot.infrastructure.utils;

import org.apache.commons.lang3.builder.MultilineRecursiveToStringStyle;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import rscvanilla.bot.api.models.wrappers.RSEntityWrapper;

public class DebugUtil {
    public static void printRecursively(Object obj) {
        var caller = getCallerClassName();
        if (caller != null) {
            System.out.println(caller);
        } else {
            System.out.println("null");
        }

        System.out.println(ReflectionToStringBuilder.toString(obj, new MultilineRecursiveToStringStyle()));
    }

    public static void print(Object obj) {
        var caller = getCallerClassName();
        if (caller != null) {
            System.out.println(caller);
        } else {
            System.out.println("null");
        }

        System.out.println(ReflectionToStringBuilder.toString(obj));
    }

    public static String getCallerClassName() {
        StackTraceElement[] stElements = Thread.currentThread().getStackTrace();
        for (int i=1; i<stElements.length; i++) {
            StackTraceElement ste = stElements[i];
            if (!ste.getClassName().equals(DebugUtil.class.getName()) && ste.getClassName().indexOf("java.lang.Thread")!=0 && !ste.getClassName().equals(RSEntityWrapper.class.getName())) {
                return ste.getClassName();
            }
        }
        return null;
    }
}
