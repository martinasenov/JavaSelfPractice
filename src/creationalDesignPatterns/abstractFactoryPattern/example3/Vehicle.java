package creationalDesignPatterns.abstractFactoryPattern.example3;

public abstract class Vehicle {

    public abstract void engineStart();

    public void engineShutDown(){

        System.out.println("Stopping the engine....");
    }

}
