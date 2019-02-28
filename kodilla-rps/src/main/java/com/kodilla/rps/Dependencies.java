package com.kodilla.rps;

import java.util.HashMap;
import java.util.Map;

public class Dependencies {
    String userImput;
    String randomWhat;
    int scorexForPc = 0;
    int scorexForUsr =0;

    public int getScorexForPc() {
        return scorexForPc;
    }

    public int getScorexForUsr() {
        return scorexForUsr;
    }

    public Dependencies(String userImput, String randomWhat) {
        this.userImput = userImput;
        this.randomWhat = randomWhat;
    }

    public String getUserImput() {
        return userImput;
    }

    public String getRandomWhat() {
        return randomWhat;
    }

    public void compare() {

        HashMap<String, Variables> figuresDependency = new HashMap<>();
        figuresDependency.put("Rock", "Nożyce");
        figuresDependency.put("Paper", "Papier");
        figuresDependency.put("Scissors", "Kamień");
        figuresDependency.put("Lizard", "Papier");
        figuresDependency.put("Spock", "Kamień");

        for (Map.Entry<String, String> entry : figuresDependency.entrySet()) {
            if (entry.getKey().equals(getUserImput())) {
                System.out.println("Komputer musi wylosować: " + entry.getValue() + " aby wygrać");
                if (entry.getValue().equals(getRandomWhat())) {
                    System.out.println("Komputer wygrał!");
                    scorexForPc ++;
                } else {
                    System.out.println("Komputer przegral");
                    scorexForUsr ++;
                }
            }
        }
    }
}