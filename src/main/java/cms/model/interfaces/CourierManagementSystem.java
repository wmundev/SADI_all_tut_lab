package cms.model.interfaces;

public interface CourierManagementSystem {

    boolean scheduleJob(double distance, String reg);

    void addVehicle(Vehicle vehicle);

    void displayVehicleInfo(String v2);

    void displayAllVehicles();

    void serviceVehicle(String v2);

    void displayAllJobs();
}
