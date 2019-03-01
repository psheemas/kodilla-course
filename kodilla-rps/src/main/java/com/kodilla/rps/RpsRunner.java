package com.kodilla.rps;


public class RpsRunner {
    public static void main(String[] args) {
        UserInputScreen userInputScreen = new UserInputScreen();
        GameItself newGame = new GameItself(userInputScreen.MainMenuScreen(), userInputScreen.NumberOfRounds());
        newGame.Game();
    }
}