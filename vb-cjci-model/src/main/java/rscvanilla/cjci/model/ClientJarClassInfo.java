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
import rscvanilla.cjci.model.classes.character.CharacterClass;
import rscvanilla.cjci.model.classes.gameentity.GameEntityClass;
import rscvanilla.cjci.model.classes.nonplayercharacter.NonPlayerCharacterClass;
import rscvanilla.cjci.model.classes.nonplayercharacterinfo.NonPlayerCharacterInfoClass;
import rscvanilla.cjci.model.classes.playercharacter.PlayerCharacterClass;
import rscvanilla.cjci.model.classes.wallobject.WallObjectClass;

@JsonPropertyOrder(alphabetic = true)
public class ClientJarClassInfo {
    public AppletClass applet = new AppletClass();
    public MudClientBaseClass mudClientBase = new MudClientBaseClass();
    public PacketBuilderClass packetBuilder = new PacketBuilderClass();
    public PacketBuilderBaseClass packetBuilderBase = new PacketBuilderBaseClass();
    public MudClientClass mudClient = new MudClientClass();
    public CharacterClass character = new CharacterClass();
    public GameEntityClass gameEntity = new GameEntityClass();
    public PlayerCharacterClass playerCharacter = new PlayerCharacterClass();
    public WallObjectClass wallObject = new WallObjectClass();
    public NonPlayerCharacterClass nonPlayerCharacter = new NonPlayerCharacterClass();
    public NonPlayerCharacterInfoClass nonPlayerCharacterInfo = new NonPlayerCharacterInfoClass();
    public PanelClass panel = new PanelClass();
    public GameElementsClass gameElements = new GameElementsClass();
    public ModelDefClass modelDef = new ModelDefClass();
}
