package cms.model.interfaces;

import java.util.ArrayList;

public abstract class AbstractVehicle implements Vehicle {
    private String registrationNumber;
    private int year;
    private String make;
    private String model;
    private double maintainanceData = new ArrayList<>();

    public AbstractVehicle(String registrationNumber, int year, String make,
                           String model, double maintainanceData) {
        this.registrationNumber = registrationNumber;
        this.year = year;
        this.make = make;
        this.model = model;
        this.maintainanceData = maintainanceData;
    }

    @Override
    public double calculateWearAndTear() {
        return Double.NaN;
    }

}
