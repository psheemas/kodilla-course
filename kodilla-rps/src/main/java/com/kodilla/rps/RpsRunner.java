package com.kodilla.rps;


public class RpsRunner {
    public static void main(String[] args) {
        OutputScreen outputScreen = new OutputScreen();

        GameItself newGame = new GameItself(outputScreen.MainMenuScreen(),outputScreen.NumberOfRounds());

        newGame.Game();
    }

}