package creationalDesignPatterns.abstractFactoryPattern.example1;

public class VictorianSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a Victorian sofa");
    }
}