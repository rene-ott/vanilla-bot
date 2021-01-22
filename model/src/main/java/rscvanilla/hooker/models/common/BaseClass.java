package rscvanilla.hooker.models.common;

import rscvanilla.hooker.contracts.WithQualifiedName;

public class BaseClass implements WithQualifiedName {
    public String qualifiedName;

    @Override
    public String getQualifiedName() { return qualifiedName; }
}
