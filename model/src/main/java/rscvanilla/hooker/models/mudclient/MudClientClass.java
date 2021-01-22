package rscvanilla.hooker.models.mudclient;

import rscvanilla.hooker.models.common.BaseClass;

public class MudClientClass extends BaseClass {
    public MudClientClassFields fields = new MudClientClassFields();
    public MudClientClassMethods methods = new MudClientClassMethods();
    public MudClientClassInterceptors interceptors = new MudClientClassInterceptors();
}
