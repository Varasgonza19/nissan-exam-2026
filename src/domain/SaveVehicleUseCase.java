package domain;

public class SaveVehicleUseCase {
     VehicleRepository vehicleRepository;

    public SaveVehicleUseCase(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }
    public void execute(Vehicle vehicle) {
        vehicleRepository.saveVehicle(vehicle);
    }
}
