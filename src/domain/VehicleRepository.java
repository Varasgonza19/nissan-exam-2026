package domain;

import java.util.ArrayList;

public interface VehicleRepository {
    public ArrayList<Vehicle> getVehicle();
    public void saveVehicle(Vehicle vehicle);
    public void deleteVehicle(String vehicleId);
}
