package data;

import java.util.ArrayList;
import java.util.Objects;

public class VehicleMemLocalDataSource {

    private ArrayList<Vehicle> storage = new ArrayList<>();

    public ArrayList<Vehicle> findAll() {
        return storage;
    }

    public void save(Vehicle vehicle) {
        storage.add(vehicle);
    }

    public void delete(String vehicleId) {
        storage.removeIf(vehicle -> Objects.equals(vehicle.getId(), vehicleId));
    }
}
