package com.rscvanilla.bot.api.wrappers;

import com.rscvanilla.bot.infrastructure.utils.DebugUtil;
import com.rscvanilla.bot.mc.MudClientHooker;

import java.util.Objects;

public abstract class WrappedObject<T> {

    public T object;
    protected MudClientHooker hooker;

    protected WrappedObject(T object, MudClientHooker hooker) {
        this.object = object;
        this.hooker = hooker;
    }

    public boolean isFresh() {
        return object != null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        return Objects.equals(object, ((WrappedObject<T>) o).object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(object);
    }

    public void printDebugInfo() {
        DebugUtil.printRecursively(object);
    }
}
