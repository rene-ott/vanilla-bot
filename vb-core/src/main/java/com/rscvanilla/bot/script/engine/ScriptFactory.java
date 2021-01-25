package com.rscvanilla.bot.script.engine;

import com.rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import com.rscvanilla.bot.script.template.RunnableScript;
import com.rscvanilla.bot.script.ScriptDependencyContext;

import javax.inject.Inject;
import java.lang.reflect.InvocationTargetException;

public class ScriptFactory {

    private final ScriptDependencyContext scriptDependencyContext;

    @Inject
    public ScriptFactory(ScriptDependencyContext scriptDependencyContext) {
        this.scriptDependencyContext = scriptDependencyContext;
    }

    public RunnableScript createScript(Class<? extends RunnableScript> clazz, ScriptAntiBanParams argumentContext) throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException, InstantiationException {

        return clazz.getDeclaredConstructor(ScriptDependencyContext.class, ScriptAntiBanParams.class).newInstance(scriptDependencyContext, argumentContext);
    }
}
