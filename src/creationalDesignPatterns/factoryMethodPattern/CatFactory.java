package creationalDesignPatterns.factoryMethodPattern;

public class CatFactory extends AnimalFactory{

    @Override
    Animal createAnimal() {
        return new Cat();
    }
}
