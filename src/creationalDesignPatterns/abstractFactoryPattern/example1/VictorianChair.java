package creationalDesignPatterns.abstractFactoryPattern.example1;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian chair");
    }
}
