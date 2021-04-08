package rscvanilla.cjci.updater.core;

import rscvanilla.cjci.model.ClientJarClassInfo;
import rscvanilla.cjci.updater.core.services.*;

import javax.inject.Inject;

public class ClientJarClassInfoService {

    private final MudClientClassMemberService mudClientClassMemberService;
    private final AppletClassMemberService appletClassMemberService;
    private final CharacterClassMemberService characterClassMemberService;
    private final GameEntityClassMemberService gameEntityClassMemberService;
    private final WallObjectClassMemberService wallObjectClassMemberService;
    private final PlayerCharacterClassMemberService playerCharacterClassMemberService;
    private final MudClientBaseClassMemberService mudClientBaseClassMemberService;
    private final PacketBuilderClassMemberService packetBuilderClassMemberService;
    private final PacketBuilderBaseClassMemberService packetBuilderBaseClassMemberService;
    private final NonPlayerCharacterClassMemberService nonPlayerCharacterClassMemberService;
    private final NonPlayerCharacterInfoClassMemberService nonPlayerCharacterInfoClassMemberService;
    private final PanelClassMemberService panelClassMemberService;
    private final GameElementsClassMemberService gameElementsClassMemberService;
    private final ModelDefClassMemberService modelDefClassMemberService;
    private final ShopInterfaceClassMemberService shopInterfaceClassMemberService;

    @Inject
    public ClientJarClassInfoService(MudClientClassMemberService mudClientClassMemberService,
                                     AppletClassMemberService appletClassMemberService,
                                     CharacterClassMemberService rsCharacterClassMemberService,
                                     GameEntityClassMemberService gameEntityClassMemberService,
                                     WallObjectClassMemberService wallObjectClassMemberService,
                                     PlayerCharacterClassMemberService playerCharacterClassMemberService,
                                     MudClientBaseClassMemberService mudClientBaseClassMemberService,
                                     PacketBuilderClassMemberService packetBuilderClassMemberService,
                                     PacketBuilderBaseClassMemberService packetBuilderBaseClassMemberService,
                                     NonPlayerCharacterClassMemberService nonPlayerCharacterClassMemberService,
                                     NonPlayerCharacterInfoClassMemberService nonPlayerCharacterInfoClassMemberService,
                                     PanelClassMemberService panelClassMemberService, GameElementsClassMemberService gameElementsClassMemberService, ModelDefClassMemberService modelDefClassMemberService, ShopInterfaceClassMemberService shopInterfaceClassMemberService) {
        this.mudClientClassMemberService = mudClientClassMemberService;
        this.appletClassMemberService = appletClassMemberService;
        this.characterClassMemberService = rsCharacterClassMemberService;
        this.gameEntityClassMemberService = gameEntityClassMemberService;
        this.wallObjectClassMemberService = wallObjectClassMemberService;
        this.playerCharacterClassMemberService = playerCharacterClassMemberService;
        this.mudClientBaseClassMemberService = mudClientBaseClassMemberService;
        this.packetBuilderClassMemberService = packetBuilderClassMemberService;
        this.packetBuilderBaseClassMemberService = packetBuilderBaseClassMemberService;
        this.nonPlayerCharacterClassMemberService = nonPlayerCharacterClassMemberService;
        this.nonPlayerCharacterInfoClassMemberService = nonPlayerCharacterInfoClassMemberService;
        this.panelClassMemberService = panelClassMemberService;
        this.gameElementsClassMemberService = gameElementsClassMemberService;
        this.modelDefClassMemberService = modelDefClassMemberService;
        this.shopInterfaceClassMemberService = shopInterfaceClassMemberService;
    }

    public void setClassValuesTo(ClientJarClassInfo clientJarClassInfo) {
        mudClientClassMemberService.setValuesToClassMembers(clientJarClassInfo.mudClient);
        appletClassMemberService.setValuesToClassMembers(clientJarClassInfo.applet);
        characterClassMemberService.setValuesToClassMembers(clientJarClassInfo.character);
        gameEntityClassMemberService.setValuesToClassMembers(clientJarClassInfo.gameEntity);
        playerCharacterClassMemberService.setValuesToClassMembers(clientJarClassInfo.playerCharacter);
        wallObjectClassMemberService.setValuesToClassMembers(clientJarClassInfo.wallObject);
        mudClientBaseClassMemberService.setValuesToClassMembers(clientJarClassInfo.mudClientBase);
        packetBuilderClassMemberService.setValuesToClassMembers(clientJarClassInfo.packetBuilder);
        packetBuilderBaseClassMemberService.setValuesToClassMembers(clientJarClassInfo.packetBuilderBase);
        nonPlayerCharacterClassMemberService.setValuesToClassMembers(clientJarClassInfo.nonPlayerCharacter);
        nonPlayerCharacterInfoClassMemberService.setValuesToClassMembers(clientJarClassInfo.nonPlayerCharacterInfo);
        panelClassMemberService.setValuesToClassMembers(clientJarClassInfo.panel);
        gameElementsClassMemberService.setValuesToClassMembers(clientJarClassInfo.gameElements);
        modelDefClassMemberService.setValuesToClassMembers(clientJarClassInfo.modelDef);
        shopInterfaceClassMemberService.setValuesToClassMembers(clientJarClassInfo.shopInterface);
    }
}
