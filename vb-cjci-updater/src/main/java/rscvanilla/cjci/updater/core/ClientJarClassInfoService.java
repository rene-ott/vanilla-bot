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

    @Inject
    public ClientJarClassInfoService(MudClientClassMemberService mudClientClassMemberService,
                                     AppletClassMemberService appletClassMemberService,
                                     RSCharacterClassMemberService rsCharacterClassMemberService,
                                     RSEntityClassMemberService rsEntityClassMemberService,
                                     RSWallObjectClassMemberService rsWallObjectClassMemberService,
                                     RSPlayerCharacterClassMemberService rsPlayerCharacterClassMemberService, MudClientBaseClassMemberService mudClientBaseClassMemberService) {
        this.mudClientClassMemberService = mudClientClassMemberService;
        this.appletClassMemberService = appletClassMemberService;
        this.rsCharacterClassMemberService = rsCharacterClassMemberService;
        this.rsEntityClassMemberService = rsEntityClassMemberService;
        this.rsWallObjectClassMemberService = rsWallObjectClassMemberService;
        this.rsPlayerCharacterClassMemberService = rsPlayerCharacterClassMemberService;
        this.mudClientBaseClassMemberService = mudClientBaseClassMemberService;
    }

    public void setClassValuesTo(ClientJarClassInfo clientJarClassInfo) {
        mudClientClassMemberService.setValuesToClassMembers(clientJarClassInfo.mudClient);
        appletClassMemberService.setValuesToClassMembers(clientJarClassInfo.applet);
        rsCharacterClassMemberService.setValuesToClassMembers(clientJarClassInfo.rsCharacter);
        rsEntityClassMemberService.setValuesToClassMembers(clientJarClassInfo.rsEntity);
        rsPlayerCharacterClassMemberService.setValuesToClassMembers(clientJarClassInfo.rsPlayerCharacter);
        rsWallObjectClassMemberService.setValuesToClassMembers(clientJarClassInfo.rsWallObject);
        mudClientBaseClassMemberService.setValuesToClassMembers(clientJarClassInfo.mudClientBase);
    }
}
