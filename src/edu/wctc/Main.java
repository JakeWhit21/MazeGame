package edu.wctc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char userInput;

        Maze maze = new Maze();

        System.out.println("Welcome to the maze!");

        do{
            System.out.println(maze.getCurrentRoomDescription() + "\n" + maze.getCurrentRoomExits());
            System.out.print(">> ");
            userInput = keyboard.next().charAt(0);
            if(userInput == 'n' || userInput == 's' || userInput == 'e' || userInput == 'w' || userInput == 'u' || userInput == 'd') {
                if(!maze.move(userInput)) {
                    System.out.println(userInput + " is not a valid direction for this room\n");
                }
            } else if (userInput == 'i') {
                System.out.println(maze.interactWithCurrentRoom());
            } else if (userInput == 'l') {
                System.out.println(maze.lootCurrentRoom());
            } else if (userInput == 'x') {
                System.out.println(maze.exitCurrentRoom());
            } else if (userInput == 'v') {
                System.out.println(maze.getPlayerInventory());
            } else {
                System.out.println("This is not a valid input\n");
            }
        }while(!maze.isFinished());

        System.out.println("YOU WIN");
        System.out.println("Your score: " + maze.getPlayerScore());
    }
}
