package rscvanilla.hook.model.classes;

import rscvanilla.hook.model.contracts.WithQualifiedName;

public class BaseClass implements WithQualifiedName {
    public String qualifiedName;

    @Override
    public String getQualifiedName() { return qualifiedName; }
}
