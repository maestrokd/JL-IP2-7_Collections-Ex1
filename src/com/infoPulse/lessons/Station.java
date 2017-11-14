package com.infoPulse.lessons;

import java.util.LinkedList;

public class Station {

    private int station_id;
    private String name;

    private int line_id;
    private Line line;


    LinkedList<Passenger> passengers = new LinkedList<>();

    public Station(String name, Line line) {
        this.name = name;
        this.line = line;
    }

    public int getStation_id() {
        return station_id;
    }

    public void setStation_id(int station_id) {

        this.station_id = station_id;
    }

    public String getInfo() {
        return line.getName() + ":" + name;
    }
}
