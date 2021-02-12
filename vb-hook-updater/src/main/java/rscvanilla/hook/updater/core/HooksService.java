package rscvanilla.hook.updater.core;

import rscvanilla.hook.updater.core.services.*;
import rscvanilla.hook.model.Hooks;

import javax.inject.Inject;

public class HooksService {

    private final MudClientClassMemberService mudClientClassMemberService;
    private final AppletClassMemberService appletClassMemberService;
    private final RSCharacterClassMemberService rsCharacterClassMemberService;
    private final RSEntityClassMemberService rsEntityClassMemberService;
    private final RSWallObjectClassMemberService rsWallObjectClassMemberService;
    private final RSPlayerCharacterClassMemberService rsPlayerCharacterClassMemberService;

    @Inject
    public HooksService(MudClientClassMemberService mudClientClassMemberService,
                        AppletClassMemberService appletClassMemberService,
                        RSCharacterClassMemberService rsCharacterClassMemberService,
                        RSEntityClassMemberService rsEntityClassMemberService,
                        RSWallObjectClassMemberService rsWallObjectClassMemberService,
                        RSPlayerCharacterClassMemberService rsPlayerCharacterClassMemberService) {
        this.mudClientClassMemberService = mudClientClassMemberService;
        this.appletClassMemberService = appletClassMemberService;
        this.rsCharacterClassMemberService = rsCharacterClassMemberService;
        this.rsEntityClassMemberService = rsEntityClassMemberService;
        this.rsWallObjectClassMemberService = rsWallObjectClassMemberService;
        this.rsPlayerCharacterClassMemberService = rsPlayerCharacterClassMemberService;
    }

    public void setClassValuesTo(Hooks hooks) {
        mudClientClassMemberService.setValuesToClassMembers(hooks.mudClient);
        appletClassMemberService.setValuesToClassMembers(hooks.applet);
        rsCharacterClassMemberService.setValuesToClassMembers(hooks.rsCharacter);
        rsEntityClassMemberService.setValuesToClassMembers(hooks.rsEntity);
        rsPlayerCharacterClassMemberService.setValuesToClassMembers(hooks.rsPlayerCharacter);
        rsWallObjectClassMemberService.setValuesToClassMembers(hooks.rsWallObject);
    }
}
