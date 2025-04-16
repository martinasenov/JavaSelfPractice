package creationalDesignPatterns.factoryMethodPattern;

public class FactoryMethodDemo {

    public static void main(String[] args) {

        AnimalFactory factory=new DogFactory();

        Animal animal=factory.createAnimal();
        System.out.println(animal.makeSound());


        factory=new CatFactory();
        animal=factory.createAnimal();
        System.out.println(animal.makeSound());

    }
}