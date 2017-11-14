package com.infoPulse.lessons;

import java.util.Queue;

public class TrainRun {


    public TrainRun(Train train, Queue<Driver> driverQueue) {
        trainRun(train, driverQueue);
    }


    public void trainRun(Train train, Queue<Driver> driverQueue) {
        System.out.println();
        System.out.println(train.getName() + " rode along the " + train.getLine().getName() + " Line");

        // Moving the driver to the train
        train.setDriver(driverQueue.poll());
        System.out.println(train.getDriver().getName() + "|" + train.getDriver().getExperience());

        for (Station station : train.getLine().stations) {
            new StationVisit(train, station);
        }

        // Get driving experience and Moving the driver from the Train
        train.getDriver().addExperience();
        System.out.println(train.getDriver().getName() + "|" + train.getDriver().getExperience());
        driverQueue.add(train.getDriver());
        train.setDriver(null);
    }
}
