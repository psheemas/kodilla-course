package com.kodilla.good.patterns.exitair;

import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightsGoogle {
    public void flightGoogle() {
        AvailableConnections availableConnections = new AvailableConnections();
        System.out.println("Flight from Warsaw to Gdańsk via Katowice");

        Set<Flight> departureCity = availableConnections.getListOfFlights().stream()
                .filter(listOfFlights -> listOfFlights.getDepartureCity() == "Warszawa")
                .collect(Collectors.toSet());

        Set<Flight> middleCity = availableConnections.getListOfFlights().stream()
                .filter(listOfFlights -> listOfFlights.getDepartureCity() == "Katowice")
                .collect(Collectors.toSet());

        System.out.println("Flights from Warsaw to Katowice: ");
        Iterator<Flight> iterDepCity = departureCity.iterator();
        while (iterDepCity.hasNext()) {
            Flight midFlight = iterDepCity.next();
            if (midFlight.getDestinationCity() == "Katowice")
                System.out.println(midFlight);
        }
        System.out.println("Flights from Katowice to Warsaw: ");
        Iterator<Flight> iterMidCity = middleCity.iterator();
        while (iterMidCity.hasNext()) {
            Flight midFlight = iterMidCity.next();
            if (midFlight.getDestinationCity() == "Gdańsk")
                System.out.println(midFlight);
        }
    }
}
