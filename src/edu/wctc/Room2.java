package edu.wctc;

public class Room2 extends Room implements Lootable{
    private int counter = 0;
    public Room2() {
        super("STORAGE");
    }

    @Override
    public String loot(Player player) {
        if (counter == 0) {
            counter++;
            return String.format("You open the chest to find a bunch of gold coins");
        } else {
            counter++;
            return String.format("This chest seems to be endless...");
        }
    }

    @Override
    public String getDescription() {
        return String.format("You notice this room is overflowing with gold coins\nThere is a chest in the middle of the room");
    }

    @Override
    public String getExitsForRoom() {
        return String.format("South");
    }
}
