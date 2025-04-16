package creationalDesignPatterns.abstractFactoryPattern.example3;

public class Motorcycle extends Vehicle{

    @Override
    public void engineStart() {
        System.out.println("Starting the motorcycle engine");
    }
}
