package com.pluralsight;

public class Vehicle extends Asset{
    String makeModel;
    int year;
    int odometer;

    public Vehicle(String description, String dateAcquire, double originalCost,String makeModel, int year, int odometer) {
        super(description,dateAcquire,originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue(){
        int currentYear = 2025; // Жестко заданный текущий год
        int age = currentYear - year;
        double value;

        if (age <= 3) {
            value = super.getOriginalCost() * (1 - 0.03 * age);
        } else if (age <= 6) {
            value = super.getOriginalCost() * (1 - 0.03 * 3 - 0.06 * (age - 3));
        } else if (age <= 10) {
            value = super.getOriginalCost() * (1 - 0.03 * 3 - 0.06 * 3 - 0.08 * (age - 6));
        } else {
            value = 1000.00;
        }
        if (odometer > 100000 && !(makeModel.toLowerCase().contains("honda") || makeModel.toLowerCase().contains("toyota"))) {
            value *= 0.75;
        }
        return value;
    }
}
