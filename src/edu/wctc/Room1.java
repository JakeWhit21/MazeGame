package edu.wctc;

public class Room1 extends Room implements Interactable{

    public Room1() {
        super("MAIN HALL");
    }

    @Override
    public String interact(Player player) {
        return String.format("You pull the lever\nNothing happens. If only the programmer added a use for this...");
    }

    @Override
    public String getDescription() {
        return String.format("This room is dark and scary\nYou see a lever in the corner");
    }

    @Override
    public String getExitsForRoom() {
        return String.format("North, South");
    }
}
