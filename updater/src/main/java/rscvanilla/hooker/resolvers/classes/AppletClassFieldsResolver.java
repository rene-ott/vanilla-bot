package rscvanilla.hooker.resolvers.classes;

import rscvanilla.hooker.matchers.fields.applet.AppletClassFieldMatcher;
import rscvanilla.hooker.resolvers.ClassFieldsBaseResolver;

import javax.inject.Inject;
import java.util.Set;

public class AppletClassFieldsResolver extends ClassFieldsBaseResolver<AppletClassFieldMatcher> {

    @Inject
    public AppletClassFieldsResolver(Set<AppletClassFieldMatcher> fieldResolvers) {
        super(fieldResolvers);
    }
}
