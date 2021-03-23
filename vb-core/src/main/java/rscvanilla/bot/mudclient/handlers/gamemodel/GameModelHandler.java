package rscvanilla.bot.mudclient.handlers.gamemodel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.bot.mudclient.handlers.InterceptorHandler;
import rscvanilla.cjci.model.ClientJarClassInfo;
import rscvanilla.contracts.interceptors.MudClientStartGameMethodInterceptor;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Map;

import static java.util.Map.entry;

public class GameModelHandler implements MudClientStartGameMethodInterceptor, InterceptorHandler {

    private static final Logger logger = LoggerFactory.getLogger(GameModelHandler.class);

    private static final Map<Integer, String> HerbDefinitions = Map.ofEntries(
        entry(165, "Guam leaf"),
        entry(435, "Marrentill"),
        entry(436, "Tarromin"),
        entry(437, "Harralander"),
        entry(438, "Ranarr Weed"),
        entry(439, "Irit Leaf"),
        entry(440, "Avantoe"),
        entry(441, "Kwuarm"),
        entry(442, "Cadantine"),
        entry(443, "Dwarf Weed"),
        entry(933, "Torstol")
    );

    private final ClientJarClassInfo clientJarClassInfo;

    @Inject
    public GameModelHandler(ClientJarClassInfo clientJarClassInfo) {
        this.clientJarClassInfo = clientJarClassInfo;
    }

    @Override
    public void onAfterStartGame() {
        for (var innerItemDefObject : getInnerItemDefObjects()) {
            var itemDef = new ItemDefWrapper(clientJarClassInfo, innerItemDefObject);

            var mapEntry = HerbDefinitions.get(itemDef.id.getValue());
            if (mapEntry == null)
                continue;

            var existingName = itemDef.name.getValue();
            var newName = existingName + " (" + mapEntry + ")";
            itemDef.name.setValue(newName);
        }
    }

    @SuppressWarnings("rawtypes")
    private ArrayList getInnerItemDefObjects(){
        try {
            var field = Class.forName(clientJarClassInfo.gameElements.qualifiedName)
                    .getDeclaredField(clientJarClassInfo.gameElements.fields.items);

            field.setAccessible(true);

            return (ArrayList) field.get(null);
        } catch (NoSuchFieldException | ClassNotFoundException | IllegalAccessException e) {
            logger.warn("Failed to ");
        }

        return new ArrayList();
    }
}
