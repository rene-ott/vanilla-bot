package rscvanilla.bot.infrastructure.utils;

import java.util.Arrays;

public class EnumUtil {

    public static <T> T getEnumFromString(Class<T> c, String string) {
        return Arrays.stream(c.getEnumConstants()).filter(it -> it.toString().equals(string)).findFirst().orElseThrow();
    }
}
