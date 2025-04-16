package creationalDesignPatterns.abstractFactoryPattern.example3;

public class Truck extends Vehicle{

    @Override
    public void engineStart() {
        System.out.println("Starting the truck engine");
    }
}
