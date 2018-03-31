package cms.model.aircraft;

import lombok.Data;

@Data
//@AllArgsConstructor
public class Aircraft {
    private String id;
    private String make;
    private String model;
    private int year;
    private Double averageSpeed;
    private int maxFlights;
    private double flightHours;
    private double serviceInterval;

    public Aircraft(String id, String make, String model, int year, Double
            averageSpeed, int maxFlights, double flightHours, double
                            serviceInterval) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.averageSpeed = averageSpeed;
        this.maxFlights = maxFlights;
        this.flightHours = flightHours;
        this.serviceInterval = serviceInterval;
    }

    public Aircraft(String id, String make, String model, int year, int
            averageSpeed, int maxFlights, double flightHours, double
                            serviceInterval) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.averageSpeed = (double) averageSpeed;
        this.maxFlights = maxFlights;
        this.flightHours = flightHours;
        this.serviceInterval = serviceInterval;
    }
}
