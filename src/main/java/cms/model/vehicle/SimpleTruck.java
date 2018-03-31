package cms.model.vehicle;

import cms.model.interfaces.AbstractVehicle;

public class SimpleTruck extends AbstractVehicle implements cms.model
        .interfaces.Truck {
    final double RATE = 0.50;
    private int loadCapacity;
    private double odometer;

    public SimpleTruck(String registrationNumber, String make, String model,
                       int year, double odometer,
                       double maintainanceData, int loadCapacity) {
        super(registrationNumber, year, make, model, maintainanceData);
        this.odometer = odometer;
        this.loadCapacity = loadCapacity;
    }
}
