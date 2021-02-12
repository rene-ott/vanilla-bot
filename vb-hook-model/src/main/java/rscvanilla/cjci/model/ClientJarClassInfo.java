package rscvanilla.cjci.model;

import rscvanilla.cjci.model.classes.applet.AppletClass;
import rscvanilla.cjci.model.classes.mudclient.MudClientClass;
import rscvanilla.cjci.model.classes.rscharacter.RSCharacterClass;
import rscvanilla.cjci.model.classes.rsentity.RSEntityClass;
import rscvanilla.cjci.model.classes.rsplayercharacter.RSPlayerCharacterClass;
import rscvanilla.cjci.model.classes.rswallobject.RSWallObjectClass;

public class ClientJarClassInfo {
    public AppletClass applet = new AppletClass();
    public MudClientClass mudClient = new MudClientClass();
    public RSCharacterClass rsCharacter = new RSCharacterClass();
    public RSEntityClass rsEntity = new RSEntityClass();
    public RSPlayerCharacterClass rsPlayerCharacter = new RSPlayerCharacterClass();
    public RSWallObjectClass rsWallObject = new RSWallObjectClass();
}
