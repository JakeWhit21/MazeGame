package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int score;
    private List<String> inventory = new ArrayList<String>();

    public void addToInventory(String item) {
        inventory.add(item);
    }

    public void addToScore(int points) {
        score = points + score;
    }

    public String getInventory() {
        return inventory.toString();
    }

    public int getScore() {
        return score;
    }


}
