package rscvanilla.hook.updater.core;

import rscvanilla.hook.updater.core.services.AppletClassMemberService;
import rscvanilla.hook.updater.core.services.MudClientClassMemberService;
import rscvanilla.hook.model.Hooks;

import javax.inject.Inject;

public class HooksService {

    private final MudClientClassMemberService mudClientClassMemberService;
    private final AppletClassMemberService appletClassMemberService;

    @Inject
    public HooksService(MudClientClassMemberService mudClientClassMemberService,
                        AppletClassMemberService appletClassMemberService) {
        this.mudClientClassMemberService = mudClientClassMemberService;
        this.appletClassMemberService = appletClassMemberService;
    }

    public void setClassValuesTo(Hooks hooks) {
        mudClientClassMemberService.setValuesToClassMembers(hooks.mudClient);
        appletClassMemberService.setValuesToClassMembers(hooks.applet);
    }
}
