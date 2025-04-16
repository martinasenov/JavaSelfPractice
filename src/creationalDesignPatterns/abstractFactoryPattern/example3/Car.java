package creationalDesignPatterns.abstractFactoryPattern.example3;

public class Car extends Vehicle{

    @Override
    public void engineStart() {
        System.out.println("Starting the car engine");
    }
}
