package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        assets.add(new House("My house", "2020-01-01", 200000.0, "123 Main St", 1, 1800, 5000));
        assets.add(new House("Vacation home", "2021-05-15", 150000.0, "456 Beach Rd", 2, 1200, 3000));
        assets.add(new Vehicle("Tom's truck", "2019-03-10", 30000.0, "Ford F150", 2018, 120000));
        assets.add(new Vehicle("Honda", "2022-07-21", 25000.0, "Honda Civic", 2021, 80000));
        for(Asset asset : assets){
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.printf("Current Value: $%.2f\n", asset.getValue());

            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Year: " + vehicle.getYear());
                System.out.println("Make/Model: " + vehicle.getMakeModel());
            }
            System.out.println("---------------------------");
        }
    }
}
