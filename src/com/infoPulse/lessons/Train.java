package com.infoPulse.lessons;

import java.util.LinkedList;

public class Train {
    private static int count = 1;

    public static final int maxNumberOfSubwayCarsInTrain = 5;
    LinkedList<Wagon> wagons = new LinkedList<>();

    private String name;

    private int train_id;
    private Train train;

    private int driver_id;
    private Driver driver;

    public String getName() {
        return name;
    }

    public int getTrain_id() {
        return train_id;
    }

    public int getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(int driver_id) {
        this.driver_id = driver_id;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Train{" +
                "wagons=" + wagons +
                ", train_id=" + train_id +
                ", driver_id=" + driver_id +
                '}';
    }

    public Train() {
        this.name = "Train_" + count++;
//        train_id = count-1;
    }


    public void getInfo (){
        for (Wagon wagon : wagons) {
            System.out.println(wagon.getType());
        }
    }


    public void addWagon(Wagon wagon, LinkedList<Wagon> subwayTrainReturnToDepot){

        if (wagons.size() == maxNumberOfSubwayCarsInTrain){
            subwayTrainReturnToDepot.addLast(wagon);
            return;
        }
        if (Wagon.firstType.equals(wagon.getType())) {
            if (wagons.size() == 0 ) {
                wagon.setTrain(this);
                wagons.addFirst(wagon);
            } else {
                wagon.setTrain(this);
                wagons.addLast(wagon);
            }
        } else if (Wagon.secondType.equals(wagon.getType())) {
            if (wagons.size() == 0) {
                wagon.setTrain(this);
                subwayTrainReturnToDepot.addLast(wagon);
                return;
            }
            if ((wagons.size() > 1 && wagons.size() < maxNumberOfSubwayCarsInTrain - 1)
                    || (wagons.size() == maxNumberOfSubwayCarsInTrain-1
                    && Wagon.firstType.equals(wagons.get(maxNumberOfSubwayCarsInTrain - 2).getType()))) {
                wagon.setTrain(this);
                wagons.add(1, wagon);
            } else {


                // Return of wagon to the subwayTrainReturnToDepot
                subwayTrainReturnToDepot.addLast(wagon);
            }
        }
    }
}


