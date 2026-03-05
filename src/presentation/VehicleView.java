package presentation;

import data.VehicleDataRepository;
import data.VehicleMemLocalDataSource;
import domain.*;

import java.util.ArrayList;

public class VehicleView {
    public static void printVehicles() {
        GetVehicleUseCase getVehicleUseCase = new GetVehicleUseCase(new VehicleDataRepository(VehicleMemLocalDataSource.newInstance()));

        ArrayList<Vehicle> vehicles= GetVehicleUseCase.execute();

        System.out.println(vehicles);
    }

    public static void saveVehicles() {
        Vehicle vehicle = new Vehicle("1", "Audi", "NVG7687", "verde", "120");
        SaveVehicleUseCase saveVehicleUseCase = new SaveVehicleUseCase(
                new VehicleDataRepository(VehicleMemLocalDataSource.newInstance()));

        saveVehicleUseCase.execute(vehicle);
    }


    public static void deleteVehicle(String vehicleId) {
        DeleteVehicleUseCase deleteVehicleUseCase = new DeleteVehicleUseCase(
                new VehicleDataRepository(VehicleMemLocalDataSource.newInstance()));
        deleteVehicleUseCase.execute(vehicleId);
    }

    public void Function1(){
        GetVehicleUseCase.execute();
        saveVehicles();
        GetVehicleUseCase.execute();
    }
    public void Function2(){
        GetVehicleUseCase.execute();
    }
    public void Function3(){
        GetVehicleUseCase.execute();
        deleteVehicle("1");
        GetVehicleUseCase.execute();
    }

}


