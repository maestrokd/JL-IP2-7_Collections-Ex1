package com.infoPulse.lessons;

import java.util.LinkedList;

public class Wagon {

    private static int count = 1;
    public static final String firstType = "Головной вагон";
    public static final String secondType = "Обычный вагон";
    public static final int maxSize = 330;

    private int wagon_id;
    private String name;
    private String type;

    private Train train;
    private Passenger passenger;
    LinkedList<Passenger> passengers = new LinkedList<>();

    public Wagon(int type) {
        this.name = "Wagon " + count++;
        wagon_id = count-1;
        if (type > 65) {
            this.type = firstType;
        }
        else this.type = secondType;
    }

    public int getWagon_id() {
        return wagon_id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }
}
