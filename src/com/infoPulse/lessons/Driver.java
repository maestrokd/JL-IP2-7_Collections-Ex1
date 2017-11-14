package com.infoPulse.lessons;


import java.util.Random;

public class Driver {


    private  int driver_id;
    private String name;
    private float experience;

    Random random = new Random();

    public Driver() {}

    public Driver(int driver_id, String name, float experience)  {
        this.driver_id = driver_id;
        this.name = name;
        this.experience = experience;
    }

    public int getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(int driver_id) {
        this.driver_id = driver_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public void addExperience() {
        experience = experience + (random.nextInt(100)-50);
    }
}
