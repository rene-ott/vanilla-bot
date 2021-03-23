package rscvanilla.cjci.updater.infrastructure.modules;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import rscvanilla.cjci.updater.core.matcher.classes.applet.AppletClassFieldNameMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.gameelements.GameElementsClassFieldNameMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.modeldef.ModelDefClassFieldNameMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassMethodNameMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclientbase.MudClientBaseClassFieldNameMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.packetbuilder.PacketBuilderClassMethodNameMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.packetbuilderbase.PacketBuilderBaseClassFieldNameMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.packetbuilderbase.PacketBuilderBaseClassMethodNameMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.panel.PanelClassMethodNameMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.rscharacter.RSCharacterClassFieldNameMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.rsentity.RSEntityClassFieldNameMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.rsnonplayercharacter.RSNonPlayerCharacterClassMethodNameMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.rsnonplayercharacterinfo.fields.RSNonPlayerCharacterInfoClassFieldNameMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.rsplayercharacter.RSPlayerCharacterClassFieldNameMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.rswallobject.RSWallObjectClassFieldNameMatcher;

public class ClassMemberNameMatcherModule extends AbstractModule {

    @Override
    protected void configure() {
        configureSubTypesOf(MudClientClassFieldNameMatcher.class);
        configureSubTypesOf(MudClientClassMethodNameMatcher.class);

        configureSubTypesOf(PacketBuilderBaseClassMethodNameMatcher.class);
        configureSubTypesOf(PacketBuilderBaseClassFieldNameMatcher.class);

        configureSubTypesOf(AppletClassFieldNameMatcher.class);
        configureSubTypesOf(RSCharacterClassFieldNameMatcher.class);
        configureSubTypesOf(RSEntityClassFieldNameMatcher.class);
        configureSubTypesOf(RSWallObjectClassFieldNameMatcher.class);
        configureSubTypesOf(RSPlayerCharacterClassFieldNameMatcher.class);
        configureSubTypesOf(MudClientBaseClassFieldNameMatcher.class);
        configureSubTypesOf(RSNonPlayerCharacterInfoClassFieldNameMatcher.class);

        configureSubTypesOf(PacketBuilderClassMethodNameMatcher.class);
        configureSubTypesOf(RSNonPlayerCharacterClassMethodNameMatcher.class);
        configureSubTypesOf(PanelClassMethodNameMatcher.class);

        configureSubTypesOf(GameElementsClassFieldNameMatcher.class);
        configureSubTypesOf(ModelDefClassFieldNameMatcher.class);
    }

    private <T> void configureSubTypesOf(Class<T> clazz) {
        var binder = Multibinder.newSetBinder(binder(), clazz);
        var reflections = new Reflections("rscvanilla", new SubTypesScanner());
        reflections.getSubTypesOf(clazz).forEach(it -> binder.addBinding().to(it));
    }
}
