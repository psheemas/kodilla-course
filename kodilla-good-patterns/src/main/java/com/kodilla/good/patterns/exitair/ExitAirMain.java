package com.kodilla.good.patterns.exitair;

import java.util.stream.Collectors;

public class ExitAirMain {
    public static void main(String[] args) {
        AvailableConnections availableConnections = new AvailableConnections();
        FlightsGoogle flightsGoogle = new FlightsGoogle();
        WelcomeScreen welcomeScreen = new WelcomeScreen();
        welcomeScreen.welcomeScreen();

        System.out.println("Flights from Warsaw: ");

        System.out.println(availableConnections.getListOfFlights().stream()
                .filter(listOfFlights -> listOfFlights.getDestinationCity() == "Warszawa")
                .map(listOfFlights -> listOfFlights.getFlightName())
                .collect(Collectors.toSet()));

        System.out.println("Flights to Warszawy");

        System.out.println(availableConnections.getListOfFlights().stream()
                .filter(listOfFlights -> listOfFlights.getDestinationCity() == "Gdańsk")
                .map(listOfFlights -> listOfFlights.getFlightName())
                .collect(Collectors.toSet()));

        flightsGoogle.flightGoogle();
    }
}
