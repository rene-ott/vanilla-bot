package rscvanilla.hook.updater.core;

import rscvanilla.hook.updater.core.services.AppletClassMemberService;
import rscvanilla.hook.updater.core.services.MudClientClassMemberService;
import rscvanilla.hook.model.Hooks;
import rscvanilla.hook.updater.core.services.RSCharacterClassMemberService;
import rscvanilla.hook.updater.core.services.RSEntityClassMemberService;

import javax.inject.Inject;

public class HooksService {

    private final MudClientClassMemberService mudClientClassMemberService;
    private final AppletClassMemberService appletClassMemberService;
    private final RSCharacterClassMemberService rsCharacterClassMemberService;
    private final RSEntityClassMemberService rsEntityClassMemberService;

    @Inject
    public HooksService(MudClientClassMemberService mudClientClassMemberService,
                        AppletClassMemberService appletClassMemberService,
                        RSCharacterClassMemberService rsCharacterClassMemberService,
                        RSEntityClassMemberService rsEntityClassMemberService) {
        this.mudClientClassMemberService = mudClientClassMemberService;
        this.appletClassMemberService = appletClassMemberService;
        this.rsCharacterClassMemberService = rsCharacterClassMemberService;
        this.rsEntityClassMemberService = rsEntityClassMemberService;
    }

    public void setClassValuesTo(Hooks hooks) {
        mudClientClassMemberService.setValuesToClassMembers(hooks.mudClient);
        appletClassMemberService.setValuesToClassMembers(hooks.applet);
        rsCharacterClassMemberService.setValuesToClassMembers(hooks.rsCharacter);
        rsEntityClassMemberService.setValuesToClassMembers(hooks.rsEntity);
    }
}
