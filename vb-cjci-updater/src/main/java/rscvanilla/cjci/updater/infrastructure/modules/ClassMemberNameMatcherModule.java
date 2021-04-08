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
import rscvanilla.cjci.updater.core.matcher.classes.character.CharacterClassFieldNameMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.gameentity.GameEntityClassFieldNameMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.nonplayercharacter.NonPlayerCharacterClassMethodNameMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.nonplayercharacterinfo.fields.NonPlayerCharacterInfoClassFieldNameMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.playercharacter.PlayerCharacterClassFieldNameMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.shopinterface.ShopInterfaceClassFieldNameMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.wallobject.WallObjectClassFieldNameMatcher;

public class ClassMemberNameMatcherModule extends AbstractModule {

    @Override
    protected void configure() {
        configureSubTypesOf(MudClientClassFieldNameMatcher.class);
        configureSubTypesOf(MudClientClassMethodNameMatcher.class);

        configureSubTypesOf(PacketBuilderBaseClassMethodNameMatcher.class);
        configureSubTypesOf(PacketBuilderBaseClassFieldNameMatcher.class);

        configureSubTypesOf(AppletClassFieldNameMatcher.class);
        configureSubTypesOf(CharacterClassFieldNameMatcher.class);
        configureSubTypesOf(GameEntityClassFieldNameMatcher.class);
        configureSubTypesOf(WallObjectClassFieldNameMatcher.class);
        configureSubTypesOf(PlayerCharacterClassFieldNameMatcher.class);
        configureSubTypesOf(MudClientBaseClassFieldNameMatcher.class);
        configureSubTypesOf(NonPlayerCharacterInfoClassFieldNameMatcher.class);

        configureSubTypesOf(PacketBuilderClassMethodNameMatcher.class);
        configureSubTypesOf(NonPlayerCharacterClassMethodNameMatcher.class);
        configureSubTypesOf(PanelClassMethodNameMatcher.class);

        configureSubTypesOf(GameElementsClassFieldNameMatcher.class);
        configureSubTypesOf(ModelDefClassFieldNameMatcher.class);
        configureSubTypesOf(ShopInterfaceClassFieldNameMatcher.class);

    }

    private <T> void configureSubTypesOf(Class<T> clazz) {
        var binder = Multibinder.newSetBinder(binder(), clazz);
        var reflections = new Reflections("rscvanilla", new SubTypesScanner());
        reflections.getSubTypesOf(clazz).forEach(it -> binder.addBinding().to(it));
    }
}
