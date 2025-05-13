package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped("red", 2, 15, 30);
        Car car = new Car("blue", 4, 70, 200);
        SemiTruck semiTruck = new SemiTruck("gray", 2, 2000, 800);
        Hovercraft hovercraft = new Hovercraft("white", 4, 50, 100);
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        System.out.println("Moped: " + slowRide.getColor()+ " | " + slowRide.getNumberOfPassengers() + " | " + slowRide.getCargoCapacity() + " | " + slowRide.getFuelCapacity());
        System.out.println("Car: " + car.getColor()+ " | " + car.getNumberOfPassengers() + " | " + car.getCargoCapacity() + " | " + car.getFuelCapacity());
        System.out.println("Semi Truck: " + semiTruck.getColor()+ " | " + semiTruck.getNumberOfPassengers() + " | " + semiTruck.getCargoCapacity() + " | " + semiTruck.getFuelCapacity());
        System.out.println("Hovercraft: " + hovercraft.getColor()+ " | " + hovercraft.getNumberOfPassengers() + " | " + hovercraft.getCargoCapacity() + " | " + hovercraft.getFuelCapacity());

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(slowRide);
    }
}
