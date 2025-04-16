package creationalDesignPatterns.abstractFactoryPattern.example1;

public class AbstractFactoryDemo {

    public static void main(String[] args) {


        FurnitureFactory factory=new VictorianFurnitureFactory();
        Chair chair=factory.createChair();
        Sofa sofa=factory.createSofa();

        chair.sitOn();
        sofa.lieOn();

        factory=new ModernFurnitureFactory();
        chair=factory.createChair();
        sofa=factory.createSofa();
        chair.sitOn();
        sofa.lieOn();



    }
}
