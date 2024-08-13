package edu.wctc;

public class Maze {
    private Room currentRoom;
    private Player player;
    private boolean isFinished = false;

    public Maze() {
        //Create player and assign it to field
        Player player = new Player();
        this.player = player;

        //create all the rooms here
        Room middleRoom = new Room1();
        Room topRoom = new Room2();
        Room bottomRoom = new Room3();

        //set rooms
        middleRoom.setNorth(topRoom);
        middleRoom.setSouth(bottomRoom);
        topRoom.setSouth(middleRoom);
        bottomRoom.setNorth(middleRoom);

        //set current room here
        currentRoom = middleRoom;
    }

    public String exitCurrentRoom() {
        if(currentRoom instanceof Exitable) {
            isFinished = true;
            return (((Exitable) currentRoom).exit(player));
        } else {
            return String.format("This room is not exitable");
        }
    }

    public String interactWithCurrentRoom() {
        if(currentRoom instanceof Interactable) {
            player.addToScore(20);
            return (((Interactable) currentRoom).interact(player));
        } else {
            return String.format("This room is not interactable");
        }
    }

    public String lootCurrentRoom() {
        if(currentRoom instanceof Lootable) {
            player.addToInventory("Bag of gold coins");
            player.addToScore(20);
            return (((Lootable) currentRoom).loot(player));
        } else {
            return String.format("There is nothing to loot here");
        }
    }

    public boolean move(char direction) {
        if(currentRoom.isValidDirection(direction)) {
            currentRoom = currentRoom.getAdjoiningRoom(direction);
            return true;
        } else {
            notValidDirection(direction);
            return false;
        }
    }

    public int getPlayerScore() {
        return player.getScore();
    }

    public String getPlayerInventory() {
        return player.getInventory();
    }

    public String getCurrentRoomDescription() {
        return String.format("You are in %s\n\n%s\n", currentRoom.getName(), currentRoom.getDescription());
    }

    public String getCurrentRoomExits() {
        return String.format("The exits are: %s", currentRoom.getExitsForRoom());
    }

    public boolean isFinished() {
        return isFinished;
    }

    public String notValidDirection(char direction) {
        return String.format("%s is not a valid movement here", direction);
    }


}
