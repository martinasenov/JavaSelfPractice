package creationalDesignPatterns.abstractFactoryPattern.example1;

public class ModernSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a modern sofa");
    }
}