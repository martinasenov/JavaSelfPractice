package creationalDesignPatterns.factoryMethodPattern;

public class Dog extends Animal{

    @Override
    String makeSound() {
        return "Woof";
    }
}
