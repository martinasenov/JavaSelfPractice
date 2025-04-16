package creationalDesignPatterns.factoryMethodPattern;

public class DogFactory extends AnimalFactory{


    @Override
    Animal createAnimal() {
        return new Dog();
    }
}
