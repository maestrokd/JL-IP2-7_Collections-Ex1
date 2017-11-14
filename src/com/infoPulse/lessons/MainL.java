package com.infoPulse.lessons;

import java.util.*;

public class MainL  {
    public static void main(String[] args) throws NoSuchElementException {

        Metro metro = new Metro();
        metro.createWagonsInDepot(100);
        metro.collectTrains(metro.getDepot(), metro.getTrains());
        metro.inspectionOfAssembledTrains(metro.getTrains());
        metro.inspectionOfDepot(metro.getDepot());
        metro.createDrivers(10);

        String[] namesOfLines = {"RedLine", "GreenLine", "BlueLine",};
        metro.setLines(metro.createAndFillLines(metro.getTrains(), namesOfLines.length, namesOfLines));

        metro.travelByStations(metro.getLines(), metro.getDriverQueue());
        metro.showListOfDriverExperience(metro.getDriverQueue());

    }
}
