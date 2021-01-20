package hooker.resolvers;

import hooker.matchers.applet.AppletClassFieldMatcher;

import javax.inject.Inject;
import java.util.Set;

public class AppletClassFieldsResolver extends ClassFieldsBaseResolver<AppletClassFieldMatcher> {

    @Inject
    public AppletClassFieldsResolver(Set<AppletClassFieldMatcher> fieldResolvers) {
        super(fieldResolvers);
    }
}
