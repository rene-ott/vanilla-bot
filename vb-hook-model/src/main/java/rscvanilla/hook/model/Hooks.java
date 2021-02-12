package rscvanilla.hook.model;

import rscvanilla.hook.model.classes.applet.AppletClass;
import rscvanilla.hook.model.classes.mudclient.MudClientClass;
import rscvanilla.hook.model.classes.rscharacter.RSCharacterClass;
import rscvanilla.hook.model.classes.rsentity.RSEntityClass;
import rscvanilla.hook.model.classes.rsplayercharacter.RSPlayerCharacterClass;
import rscvanilla.hook.model.classes.rswallobject.RSWallObjectClass;

public class Hooks {
    public AppletClass applet = new AppletClass();
    public MudClientClass mudClient = new MudClientClass();
    public RSCharacterClass rsCharacter = new RSCharacterClass();
    public RSEntityClass rsEntity = new RSEntityClass();
    public RSPlayerCharacterClass rsPlayerCharacter = new RSPlayerCharacterClass();
    public RSWallObjectClass rsWallObject = new RSWallObjectClass();
}
