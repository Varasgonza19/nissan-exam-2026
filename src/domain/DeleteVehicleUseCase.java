package domain;

public class DeleteVehicleUseCase {
    private VehicleRepository vehicleRepository;

    public DeleteVehicleUseCase(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public void execute(String vehicleId) {
        vehicleRepository.deleteVehicle(vehicleId);
    }
}
