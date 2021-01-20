package rscvanilla.hooker.resolvers.classes;

import rscvanilla.hooker.matchers.fields.mudclient.MudClientClassFieldMatcher;
import rscvanilla.hooker.resolvers.ClassFieldsBaseResolver;

import javax.inject.Inject;
import java.util.*;

public class MudClientClassFieldsResolver extends ClassFieldsBaseResolver<MudClientClassFieldMatcher> {

    @Inject
    public MudClientClassFieldsResolver(Set<MudClientClassFieldMatcher> fieldResolvers) {
        super(fieldResolvers);
    }
}
