package creationalDesignPatterns.abstractFactoryPattern.example3;

public class CarFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
