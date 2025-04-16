package creationalDesignPatterns.factoryMethodPattern;

public class Cat extends Animal{

    @Override
    String makeSound() {
        return "Meow";
    }
}
