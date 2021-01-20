package rscvanilla.hooker.resolvers;

import rscvanilla.hooker.matchers.mudclient.MudClientClassFieldMatcher;

import javax.inject.Inject;
import java.util.*;

public class MudClientClassFieldsResolver extends ClassFieldsBaseResolver<MudClientClassFieldMatcher> {

    @Inject
    public MudClientClassFieldsResolver(Set<MudClientClassFieldMatcher> fieldResolvers) {
        super(fieldResolvers);
    }
}
