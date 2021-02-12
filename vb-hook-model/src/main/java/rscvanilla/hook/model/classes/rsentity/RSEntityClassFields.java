package rscvanilla.hook.model.classes.rsentity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.hook.model.annotations.YamlClassInfo;
import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.model.contracts.WithClassMembers;

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
