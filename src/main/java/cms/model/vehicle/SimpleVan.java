package cms.model.vehicle;

import cms.model.interfaces.AbstractVehicle;
import cms.model.interfaces.Van;
import lombok.Getter;

@Getter
public class SimpleVan extends AbstractVehicle implements Van {
    final double RATE = 0.50;
    private double odometer;

    public SimpleVan(String registrationNumber, String make, String model, int
            year, double odometer, double maintainanceData) {
        super(registrationNumber, year, make, model, maintainanceData);
    }
}
