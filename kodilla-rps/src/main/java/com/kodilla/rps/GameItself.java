package com.kodilla.rps;

import java.util.ArrayList;

public class GameItself {
    String playerName;
    int numberOfRounds;

    public GameItself(String playerName, int numberOfRounds) {
        this.playerName = playerName;
        this.numberOfRounds = numberOfRounds;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public void Game(){
        int computerPoints = 0;
        int userPoints = 0;
        int rounds = 1;
        boolean end = false;

        OutputScreen outputScreen = new OutputScreen();

        ArrayList<String> znaczki = new ArrayList<>();
        znaczki.add("Rock");
        znaczki.add("Paper");
        znaczki.add("Scissors");
        znaczki.add("Lizard");
        znaczki.add("Spock");

        for(int r=0; r<getNumberOfRounds();r++){
            RpsRandom rpsRandom = new RpsRandom();
            int computerMove = rpsRandom.generateRandom();

            System.out.println("Current round: " + rounds);
            System.out.println(" ");
            System.out.println("Ok " + getPlayerName() + " choose");
            System.out.println(" ");

            String userChosenInput = znaczki.get(Integer.parseInt(outputScreen.OptionsScreen())-1);
            System.out.println("User chose: " + userChosenInput);


            Dependencies comapreShit = new Dependencies(userChosenInput, znaczki.get(computerMove));
            comapreShit.compare();

            System.out.println("PC chose: " + znaczki.get(computerMove));

            computerPoints = computerPoints + comapreShit.getScorexForPc();
            userPoints = userPoints + comapreShit.getScorexForUsr();

            outputScreen.ScoreScreen(computerPoints,userPoints);

            rounds = rounds +1;
        }

    }

}
