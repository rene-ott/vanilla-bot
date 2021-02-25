package rscvanilla.cjci.updater.core;

import rscvanilla.cjci.model.ClientJarClassInfo;
import rscvanilla.cjci.updater.core.services.*;

import javax.inject.Inject;

public class ClientJarClassInfoService {

    private final MudClientClassMemberService mudClientClassMemberService;
    private final AppletClassMemberService appletClassMemberService;
    private final RSCharacterClassMemberService rsCharacterClassMemberService;
    private final RSEntityClassMemberService rsEntityClassMemberService;
    private final RSWallObjectClassMemberService rsWallObjectClassMemberService;
    private final RSPlayerCharacterClassMemberService rsPlayerCharacterClassMemberService;
    private final MudClientBaseClassMemberService mudClientBaseClassMemberService;
    private final PacketBuilderClassMemberService packetBuilderClassMemberService;
    private final PacketBuilderBaseClassMemberService packetBuilderBaseClassMemberService;
    private final RSNonPlayerCharacterClassMemberService rsNonPlayerCharacterClassMemberService;
    private final RSNonPlayerCharacterInfoClassMemberService rsNonPlayerCharacterInfoClassMemberService;
    private final PanelClassMemberService panelClassMemberService;

    @Inject
    public ClientJarClassInfoService(MudClientClassMemberService mudClientClassMemberService,
                                     AppletClassMemberService appletClassMemberService,
                                     RSCharacterClassMemberService rsCharacterClassMemberService,
                                     RSEntityClassMemberService rsEntityClassMemberService,
                                     RSWallObjectClassMemberService rsWallObjectClassMemberService,
                                     RSPlayerCharacterClassMemberService rsPlayerCharacterClassMemberService,
                                     MudClientBaseClassMemberService mudClientBaseClassMemberService,
                                     PacketBuilderClassMemberService packetBuilderClassMemberService,
                                     PacketBuilderBaseClassMemberService packetBuilderBaseClassMemberService,
                                     RSNonPlayerCharacterClassMemberService rsNonPlayerCharacterClassMemberService,
                                     RSNonPlayerCharacterInfoClassMemberService rsNonPlayerCharacterInfoClassMemberService,
                                     PanelClassMemberService panelClassMemberService) {
        this.mudClientClassMemberService = mudClientClassMemberService;
        this.appletClassMemberService = appletClassMemberService;
        this.rsCharacterClassMemberService = rsCharacterClassMemberService;
        this.rsEntityClassMemberService = rsEntityClassMemberService;
        this.rsWallObjectClassMemberService = rsWallObjectClassMemberService;
        this.rsPlayerCharacterClassMemberService = rsPlayerCharacterClassMemberService;
        this.mudClientBaseClassMemberService = mudClientBaseClassMemberService;
        this.packetBuilderClassMemberService = packetBuilderClassMemberService;
        this.packetBuilderBaseClassMemberService = packetBuilderBaseClassMemberService;
        this.rsNonPlayerCharacterClassMemberService = rsNonPlayerCharacterClassMemberService;
        this.rsNonPlayerCharacterInfoClassMemberService = rsNonPlayerCharacterInfoClassMemberService;
        this.panelClassMemberService = panelClassMemberService;
    }

    public void setClassValuesTo(ClientJarClassInfo clientJarClassInfo) {
        mudClientClassMemberService.setValuesToClassMembers(clientJarClassInfo.mudClient);
        appletClassMemberService.setValuesToClassMembers(clientJarClassInfo.applet);
        rsCharacterClassMemberService.setValuesToClassMembers(clientJarClassInfo.rsCharacter);
        rsEntityClassMemberService.setValuesToClassMembers(clientJarClassInfo.rsEntity);
        rsPlayerCharacterClassMemberService.setValuesToClassMembers(clientJarClassInfo.rsPlayerCharacter);
        rsWallObjectClassMemberService.setValuesToClassMembers(clientJarClassInfo.rsWallObject);
        mudClientBaseClassMemberService.setValuesToClassMembers(clientJarClassInfo.mudClientBase);
        packetBuilderClassMemberService.setValuesToClassMembers(clientJarClassInfo.packetBuilder);
        packetBuilderBaseClassMemberService.setValuesToClassMembers(clientJarClassInfo.packetBuilderBase);
        rsNonPlayerCharacterClassMemberService.setValuesToClassMembers(clientJarClassInfo.rsNonPlayerCharacter);
        rsNonPlayerCharacterInfoClassMemberService.setValuesToClassMembers(clientJarClassInfo.rsNonPlayerCharacterInfo);
        panelClassMemberService.setValuesToClassMembers(clientJarClassInfo.panel);
    }
}
