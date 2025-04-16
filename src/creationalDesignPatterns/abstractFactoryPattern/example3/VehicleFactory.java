package creationalDesignPatterns.abstractFactoryPattern.example3;

public abstract class VehicleFactory {
    public abstract Vehicle createVehicle();

    public void manageVehicle(){

        Vehicle vehicle=createVehicle();
        vehicle.engineStart();

        vehicle.engineShutDown();
    }
}
