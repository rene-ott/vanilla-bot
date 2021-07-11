package scripts;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;

public class GnomeStrongholdFlaxPicker extends RunnableScript {

    private final static int FLAX_ID = 675;
    private final static int GNOME_BANKER_ID = 540;

    private final static int FLAX_PLANT_ID = 313;
    private final static Position FLAX_PLANT_POS = new Position(714, 502);

    private final static int LADDER_UPSIDE_ID = 6;
    private final static Position LADDER_UPSIDE_POS = new Position(714, 1444);

    private final static int LADDER_DOWNSIDE_ID = 5;
    private final static Position LADDER_DOWNSIDE_POS = new Position(714, 500);

    private State action;


    public GnomeStrongholdFlaxPicker(ScriptDependencyContext dependencyContext, ScriptAntiBanParams antiBanParameters) {
        super(dependencyContext, antiBanParameters);
    }

    @Override
    protected void loop() {
        waitFor(500);

        var newState = getAction();
        if (newState != this.action) {
            print("STATE: " + this.action + " -> " + newState);
        }

        this.action = newState;

        switch (action) {
            case PICK -> pickFlax();
            case WALK_TO_PICK -> walkToPick();
            case BANK -> bankItems();
            default -> throw new IllegalStateException();
        }

    }

    private State getAction() {
        if (isInventoryFullOfFlax()) {
                return State.BANK;
        }
        else {
            if (isInPickingSpot()) {
                return State.PICK;
            }
            else {
                return State.WALK_TO_PICK;
            }
        }
    }

    public void pickFlax() {
        atGroundObject(FLAX_PLANT_ID, FLAX_PLANT_POS);
    }

    public void walkToPick() {
        climbDown();
    }

    public void bankItems() {
        if (isBankWindowVisible()) {
            depositAllBankItems(FLAX_ID);
            waitFor(300);
            return;
        }

        if (isOptionsMenuVisible()) {
            selectOptionsMenuAnswer(0);
            waitFor(5000);
            return;
        }

        if (isInPickingSpot()) {
            climbUp();
            return;
        }

        talkToNpc(GNOME_BANKER_ID);
        waitFor(2000);
    }

    public boolean isInPickingSpot() {
        return isPosInDistanceOfCurrentPos(FLAX_PLANT_POS, 1);
    }

    public boolean isInventoryFullOfFlax() {
        return isItemInInventory(FLAX_ID, 30);
    }

    private void climbDown() {
        atGroundObject(LADDER_UPSIDE_ID, LADDER_UPSIDE_POS);
    }

    private void climbUp() {
        atGroundObject(LADDER_DOWNSIDE_ID, LADDER_DOWNSIDE_POS);
    }

    @Override
    protected void onChatMessageReceived(String sender, String message) {
    }

    @Override
    protected void onGameMessageReceived(String message) {
    }

    private enum State {
        PICK,
        WALK_TO_PICK,
        BANK
    }
}
