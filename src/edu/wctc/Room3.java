package edu.wctc;

public class Room3 extends Room implements Exitable{

    public Room3() {
        super("BACK HALL");
    }

    @Override
    public String exit(Player player) {
        return String.format("You have left the maze! (Even though its just a straight line)");

    }

    @Override
    public String getDescription() {
        return String.format("You can feel a faint draft coming from the door on the other side of this room\nThis room is exitable!");
    }

    @Override
    public String getExitsForRoom() {
        return String.format("North");
    }
}
