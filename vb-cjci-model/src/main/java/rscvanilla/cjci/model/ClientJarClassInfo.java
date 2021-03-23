package rscvanilla.cjci.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.cjci.model.classes.applet.AppletClass;
import rscvanilla.cjci.model.classes.gameelements.GameElementsClass;
import rscvanilla.cjci.model.classes.modeldef.ModelDefClass;
import rscvanilla.cjci.model.classes.mudclient.MudClientClass;
import rscvanilla.cjci.model.classes.mudclientbase.MudClientBaseClass;
import rscvanilla.cjci.model.classes.packetbuilder.PacketBuilderClass;
import rscvanilla.cjci.model.classes.packetbuilderbase.PacketBuilderBaseClass;
import rscvanilla.cjci.model.classes.panel.PanelClass;
import rscvanilla.cjci.model.classes.rscharacter.RSCharacterClass;
import rscvanilla.cjci.model.classes.rsentity.RSEntityClass;
import rscvanilla.cjci.model.classes.rsnonplayercharacter.RSNonPlayerCharacterClass;
import rscvanilla.cjci.model.classes.rsnonplayercharacterinfo.RSNonPlayerCharacterInfoClass;
import rscvanilla.cjci.model.classes.rsplayercharacter.RSPlayerCharacterClass;
import rscvanilla.cjci.model.classes.rswallobject.RSWallObjectClass;

@JsonPropertyOrder(alphabetic = true)
public class ClientJarClassInfo {
    public AppletClass applet = new AppletClass();
    public MudClientBaseClass mudClientBase = new MudClientBaseClass();
    public PacketBuilderClass packetBuilder = new PacketBuilderClass();
    public PacketBuilderBaseClass packetBuilderBase = new PacketBuilderBaseClass();
    public MudClientClass mudClient = new MudClientClass();
    public RSCharacterClass rsCharacter = new RSCharacterClass();
    public RSEntityClass rsEntity = new RSEntityClass();
    public RSPlayerCharacterClass rsPlayerCharacter = new RSPlayerCharacterClass();
    public RSWallObjectClass rsWallObject = new RSWallObjectClass();
    public RSNonPlayerCharacterClass rsNonPlayerCharacter = new RSNonPlayerCharacterClass();
    public RSNonPlayerCharacterInfoClass rsNonPlayerCharacterInfo = new RSNonPlayerCharacterInfoClass();
    public PanelClass panel = new PanelClass();
    public GameElementsClass gameElements = new GameElementsClass();
    public ModelDefClass modelDef = new ModelDefClass();
}
