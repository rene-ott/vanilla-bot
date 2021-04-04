package rscvanilla.bot.mudclient.actions;

import rscvanilla.bot.mudclient.enums.OpCodeOut;
import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.mudclient.wrappers.entities.GroundObject;
import rscvanilla.bot.mudclient.wrappers.MudClientWrapper;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class GroundObjectAction extends BaseAction {

    private final WalkAction walkAction;

    @Inject
    public GroundObjectAction(MudClientWrapper hooks,
                              WalkAction walkAction
    ) {
        super(hooks);
        this.walkAction = walkAction;
    }

    public boolean isObjectNear(int globalX, int globalY) {
        return getNearestObject(new Integer[] { null, globalX, globalY }) != null;
    }

    public boolean isObjectNear(int id, int globalX, int globalY) {
        return getNearestObject(new Integer[] { id, globalX, globalY }) != null;
    }

    public boolean isObjectNear(int id, Position globalPosition) {
        return getNearestObject(new Integer[] { id, globalPosition.getX(), globalPosition.getY() }) != null;
    }

    public void atObject(int id) {
        atObject(new Integer[][] { new Integer[] { id, null, null} }, OpCodeOut.OBJECT_COMMAND1);
    }

    public void atObject(int globalX, int globalY) {
        atObject(new Integer[][] { new Integer[] { null, globalX, globalY} }, OpCodeOut.OBJECT_COMMAND1);
    }

    public void atObject(int id, Position position) {
        atObject(new Integer[][] { new Integer[] { id, position.getX(), position.getY() } }, OpCodeOut.OBJECT_COMMAND1);
    }

    public void atObject(int id, int globalX, int globalY) {
        atObject(new Integer[][] { new Integer[] { id, globalX, globalY} }, OpCodeOut.OBJECT_COMMAND1);
    }

    public void atObject(int...ids) {
        atObject(Arrays.stream(ids).mapToObj(it -> new Integer[] { it, null, null }).toArray(Integer[][]::new), OpCodeOut.OBJECT_COMMAND1);
    }

    public void atObject2(int...ids) {
        atObject(Arrays.stream(ids).mapToObj(it -> new Integer[] { it, null, null }).toArray(Integer[][]::new), OpCodeOut.OBJECT_COMMAND2);
    }

    public void atObject(int[][] coordinateList) {
        atObject(Arrays.stream(coordinateList).map(it -> new Integer[] { null, it[0], it[1] }).toArray(Integer[][]::new), OpCodeOut.OBJECT_COMMAND1);
    }

    public void atObject(Integer[][] listOfTupleParams, OpCodeOut opCode) {
        var object = getNearestObject(listOfTupleParams);
        if (object == null) {
            return;
        }

        atObjectWalkTo(object, opCode);
    }

    private void atObjectWalkTo(GroundObject object, OpCodeOut opCode) {
        var localPosition = object.getLocalPosition();
        var globalPosition = object.getGlobalPosition();

        // TODO: Figure out what the dir parameter is
        walkAction.walkToObject(localPosition.getX(), localPosition.getY(), 0, object.getId());

        mudClientWrapper.getPacketBuilder()
                .setOpCode(opCode)
                .putShort(globalPosition.getX())
                .putShort(globalPosition.getY())
                .send();
    }

    GroundObject getNearestObject(Integer[] tupleParams) {
        return getNearestObject(new Integer[][] { tupleParams });
    }

    // Accepts tuples (id, x, y), (id, null, null), (null, x, y)
    private GroundObject getNearestObject(Integer[][] listOfTupleParams) {
        var objectStream = mudClientWrapper.getGroundObjects()
                .stream()
                .filter(Objects::nonNull)
                .filter(it -> Arrays.stream(listOfTupleParams)
                        .anyMatch(tuple ->
                                (tuple[0] == null || it.getId() == tuple[0]) &&
                                ((tuple[1] == null && tuple[2] == null && tuple[0] != null) || (it.getGlobalPosition().getX() == tuple[1] && it.getGlobalPosition().getY() == tuple[2]))
                        )
                );

        var objectList = objectStream.collect(Collectors.toList());

        if (objectList.isEmpty())
            return null;

        return (GroundObject) mudClientWrapper.getLocalPlayer().getNearest(objectList);
    }
}
