package com.infoPulse.lessons;

import java.util.LinkedList;
import java.util.Random;

public class Depot {

    private LinkedList<Wagon> wagons = new LinkedList<>();
    private LinkedList<Wagon> wagonsReturnToDepot = new LinkedList<>();

    private Random random = new Random();

    public Depot (int numberOfWagonsInDepot){

          for (int i = 0; i < numberOfWagonsInDepot; i++){
              wagons.add(new Wagon(random.nextInt(100)));
          }
         System.out.println("Number of wagons collected in the depot: " + wagons.size());


        // List of wagons in the depot
//        for (Wagon subwayCar : wagons){
//            System.out.println(subwayCar.getType());
//        }
    }

    public LinkedList<Wagon> getWagons() {
        return wagons;
    }

    public void setWagons(LinkedList<Wagon> wagons) {
        this.wagons = wagons;
    }

    public LinkedList<Wagon> getWagonsReturnToDepot() {
        return wagonsReturnToDepot;
    }

    public void setWagonsReturnToDepot(LinkedList<Wagon> wagonsReturnToDepot) {
        this.wagonsReturnToDepot = wagonsReturnToDepot;
    }
}
