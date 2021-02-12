package rscvanilla.cjci.model.classes;

import rscvanilla.cjci.model.contracts.WithQualifiedName;

public class BaseClass implements WithQualifiedName {
    public String qualifiedName;

    @Override
    public String getQualifiedName() { return qualifiedName; }
}
