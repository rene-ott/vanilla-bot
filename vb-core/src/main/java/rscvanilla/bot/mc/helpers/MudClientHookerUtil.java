package rscvanilla.bot.mc.helpers;

import rscvanilla.bot.api.models.wrappers.RSEntity;
import rscvanilla.bot.infrastructure.BotException;
import rscvanilla.bot.mc.MudClientHooker;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MudClientHookerUtil {

    public static <TObject extends RSEntity<TInternalObject>, TInternalObject extends com.rsc.e.d> List<TObject> newIndexedList(
        TInternalObject[] internalArray,
        int internalArrayLength,
        Class<TObject> clazz,
        MudClientHooker mudClientHooker
    ) {
        return IntStream.range(0, internalArrayLength)
            .mapToObj(i -> newInstance(internalArray[i], clazz, mudClientHooker))
            .collect(Collectors.toList());
    }

    private static <TEntity extends RSEntity<TInternalObject>, TInternalObject extends com.rsc.e.d> TEntity newInstance(
        TInternalObject internalObject,
        Class<TEntity> clazz,
        MudClientHooker mudClientHooker
    ) {
        if (internalObject == null) {
            return null;
        }

        try {
            var constructor = clazz.getDeclaredConstructor(internalObject.getClass(), mudClientHooker.getClass());

            return constructor.newInstance(internalObject, mudClientHooker);
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new BotException("Indexed list creation failed", e);
        }
    }
}


