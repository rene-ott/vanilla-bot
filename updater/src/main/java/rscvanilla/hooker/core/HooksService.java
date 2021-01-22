package rscvanilla.hooker.core;

import rscvanilla.hooker.core.services.AppletClassMemberService;
import rscvanilla.hooker.core.services.MudClientClassMemberService;
import rscvanilla.hooker.models.Hooks;

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
