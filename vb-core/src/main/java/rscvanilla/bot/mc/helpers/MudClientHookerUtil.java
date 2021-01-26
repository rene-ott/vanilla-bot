package rscvanilla.bot.mc.helpers;

import rscvanilla.bot.api.wrappers.WrappedObject;
import rscvanilla.bot.mc.MudClientHooker;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MudClientHookerUtil {
    public static <TObject extends WrappedObject<THookedObject>, THookedObject> List<TObject> newIndexedList(
            THookedObject[] array, int length, Class<TObject> clazz, MudClientHooker mudClientHooker) {
        return IntStream.range(0, length).mapToObj(i -> {
            var npcArrayElement = array[i];
            if (npcArrayElement != null) {
                try {
                    var npcArrayElementClass = npcArrayElement.getClass();
                    return clazz.getDeclaredConstructor(npcArrayElementClass, MudClientHooker.class).newInstance(npcArrayElement, mudClientHooker);
                } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }

            return null;
        }).collect(Collectors.toList());
    }
}


