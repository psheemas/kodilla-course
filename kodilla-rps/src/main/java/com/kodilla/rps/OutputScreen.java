package com.kodilla.rps;

import java.util.Scanner;

public class OutputScreen {
    public Scanner scanner = new Scanner(System.in);

    public String MainMenuScreen(){
        System.out.println("Hello in Rock Paper Scissors Lizard Spock!");
        System.out.println("Your name please: ");
        String playerName = scanner.next();
        return playerName;
    }

    public String OptionsScreen(){
        System.out.println("Key [1] - Rock");
        System.out.println("Key [2] - Paper");
        System.out.println("Key [3] - Scissors");
        System.out.println("Key [4] - Lizard");
        System.out.println("Key [5] - Spock");
        System.out.println("Key [n] - New game");
        System.out.println("Key [x] - Finish");

        String userInput = scanner.next();
        return userInput;
    }
    public void ScoreScreen(int computerPoints,int userPoints){
        System.out.println("Actual score: ");
        System.out.println("PC: " + computerPoints);
        System.out.println("User: " + userPoints);
        System.out.println(" ");
        System.out.println(" ");
    }
    public int NumberOfRounds(){
        System.out.println("# of rounds: ");
        int numberOfRounds = scanner.nextInt();
        return numberOfRounds;
    }
}
