package rscvanilla.bot.mc.helpers;

import rscvanilla.bot.api.models.wrappers.RSEntityWrapper;
import rscvanilla.bot.infrastructure.BotException;
import rscvanilla.bot.mc.MudClientWrapper;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MudClientHookerUtil {

    public static <TObject extends RSEntityWrapper<TInternalObject>, TInternalObject extends com.rsc.e.d> List<TObject> newIndexedList(
        TInternalObject[] internalArray,
        int internalArrayLength,
        Class<TObject> clazz,
        MudClientWrapper mudClientWrapper
    ) {
        return IntStream.range(0, internalArrayLength)
            .mapToObj(i -> newInstance(internalArray[i], clazz, mudClientWrapper))
            .collect(Collectors.toList());
    }

    private static <TEntity extends RSEntityWrapper<TInternalObject>, TInternalObject extends com.rsc.e.d> TEntity newInstance(
        TInternalObject internalObject,
        Class<TEntity> clazz,
        MudClientWrapper mudClientWrapper
    ) {
        if (internalObject == null) {
            return null;
        }

        try {
            var constructor = clazz.getDeclaredConstructor(internalObject.getClass(), mudClientWrapper.getClass());

            return constructor.newInstance(internalObject, mudClientWrapper);
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new BotException("Indexed list creation failed", e);
        }
    }
}


