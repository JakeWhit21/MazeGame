package edu.wctc;

public abstract class Room{
    private String name;
    private Room north, south, east, west, up, down;

    public Room(String name) {
        this.name = name;
    }

    public abstract String getDescription();

    public abstract String getExitsForRoom();

    public Room getAdjoiningRoom(char input) {
        if(input == 'n') {
            return north;
        } else if (input == 's') {
            return south;
        } else if (input == 'e') {
            return east;
        } else if (input == 'w') {
            return west;
        } else if (input == 'u') {
            return up;
        } else if (input == 'd') {
            return down;
        } else {
            return null;
        }

    }

    public String getExists() {
        //wasn't sure how to use this
        return getExitsForRoom();
    }

    public String getName() {
        return name;
    }

    public boolean isValidDirection(char direction) {
        if(getAdjoiningRoom(direction) != null) {
            return true;
        } else {
            return false;
        }
    }

    public void setDown(Room down) {
        this.down = down;
    }

    public void setUp(Room up) {
        this.up = up;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setWest(Room west) {
        this.west = west;
    }
}
