package rscvanilla.cjci.model.classes.rsentity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.model.contracts.WithClassMembers;

@JsonPropertyOrder(alphabetic = true)
@YamlClassInfo("fields")
public class RSEntityClassFields implements WithClassMembers {
    @YamlClassMemberKey("id") public String id;
    @YamlClassMemberKey("pixel_x") public String pixelX;
    @YamlClassMemberKey("pixel_y") public String pixelY;
    @YamlClassMemberKey("server_index") public String serverIndex;
    @YamlClassMemberKey("local_position_x") public String localPositionX;
    @YamlClassMemberKey("local_position_y") public String localPositionY;
}
