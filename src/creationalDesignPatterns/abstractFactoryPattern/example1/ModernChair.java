package creationalDesignPatterns.abstractFactoryPattern.example1;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern chair");
    }
}
