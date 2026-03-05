package domain;

import java.util.ArrayList;

public class GetVehicleUseCase {
    private static VehicleRepository vehicleRepository;

    public GetVehicleUseCase(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public static ArrayList<Vehicle> execute() {
        return vehicleRepository.getVehicle();
    }
}
