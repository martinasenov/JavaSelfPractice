package creationalDesignPatterns.abstractFactoryPattern.example3;

public class FactoryMethodVehicleDemo {
    public static void main(String[] args) {


        VehicleFactory carFactory=new CarFactory();
        carFactory.manageVehicle();

        VehicleFactory truckFactory=new TruckFactory();
        truckFactory.manageVehicle();

        VehicleFactory motorcycleFactory= new MotorcycleFactory();
        motorcycleFactory.manageVehicle();

    }
}
