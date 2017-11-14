package com.infoPulse.lessons;

import java.util.Random;

public class StationVisit {


    public StationVisit(Train train, Station station) {

        if (train.getLine().stations.getLast().equals(station)) {

            // If station is last
            lastStationVisit(train, station);
        } else {

            // If station not last
            stationVisit(train, station);
        }
    }


    // If station not last
    public void stationVisit(Train train, Station station) {

        int countPassenger;
        int numberOfPassengersToOut;
        Random random = new Random();

        for (int i = 0; i < (random.nextInt(400) + 800); i++) {
            station.passengers.add(new Passenger());
        }
        int numberOfPassengerInStation = station.passengers.size();
        System.out.println();
        System.out.println(station.getInfo() + " | " + station.passengers.size() + " passengers are ready to go");

        for (Wagon wagon : train.wagons) {
            System.out.print(wagon.getName() + " | " + wagon.passengers.size() + " | ");


            // TODO Passengers move out
            if (wagon.passengers.size() != 0) {

                // TODO Test
//                                wagon.passengers.removeAll(wagon.passengers.subList(1, random.nextInt(wagon.passengers.size()));

                countPassenger = 0;

                // Old version
//                            numberOfPassengersToOut = wagon.passengers.size()/2;

                numberOfPassengersToOut = random.nextInt(wagon.passengers.size());

                for (int i = 0; i < numberOfPassengersToOut; i++) {
                    wagon.passengers.remove();
                    countPassenger++;
                }
                System.out.print(countPassenger + " -->> out | ");
            } else {
                System.out.print("0 -->> out | ");
            }

            countPassenger = 0;
            while ((wagon.passengers.size() < Wagon.maxSize) && (!station.passengers.isEmpty())) {
                wagon.passengers.add(station.passengers.pollFirst());
                countPassenger++;
            }
            System.out.print("in <<-- " + countPassenger + " | ");
            System.out.println(wagon.getName() + " | " + wagon.passengers.size());
        }
        System.out.println(station.getInfo() + " | " + station.passengers.size() + " passengers left at the station");



    }


    // If station is last
    public void lastStationVisit(Train train, Station station) {
        int countPassenger;

        System.out.println();
        System.out.println(station.getInfo() + " | Last station! |" + station.passengers.size() + " passengers who finished the trip");

        for (Wagon wagon : train.wagons) {
            System.out.print(wagon.getName() + " | " + wagon.passengers.size() + " | ");

                if (wagon.passengers.size() != 0) {
                    countPassenger = wagon.passengers.size();
                    station.passengers.addAll(wagon.passengers);
                    wagon.passengers.clear();
                    System.out.print(countPassenger + " -->> out | ");
                } else {
                    System.out.print("0 -->> out | ");
                }
                System.out.println(wagon.getName() + " | " + wagon.passengers.size());
            }
            System.out.println(station.getInfo() + " | " + station.passengers.size() + " passengers who finished the trip");






    }


}
