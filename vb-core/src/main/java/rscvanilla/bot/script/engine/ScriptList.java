package rscvanilla.bot.script.engine;

import rscvanilla.bot.script.template.RunnableScript;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ScriptList {

    private Class<? extends RunnableScript> selectedElement;
    private final List<Class<? extends RunnableScript>> elements;

    @Inject
    public ScriptList() {
        elements = new ArrayList<>();
    }

    public void addScripts(List<Class<? extends RunnableScript>> scripts) {
        scripts.sort(Comparator.comparing(Class::getSimpleName));
        elements.addAll(scripts);
    }

    public Class<? extends RunnableScript> getSelection() {
        return selectedElement;
    }

    public void clearElements() {
        elements.clear();
    }

    public void setSelection(Class<? extends RunnableScript> selectedElement) {
        this.selectedElement = selectedElement;
    }

    public void replaceOldSelectedScriptWithNew() {
        if (selectedElement == null)
            return;

        selectedElement = elements.stream()
                .filter(it -> it.getSimpleName().equals(selectedElement.getSimpleName()))
                .findFirst()
                .orElse(null);
    }

    public List<Class<? extends RunnableScript>> getAll() {
        return this.elements;
    }

    public int count() {
        return elements.size();
    }
}
