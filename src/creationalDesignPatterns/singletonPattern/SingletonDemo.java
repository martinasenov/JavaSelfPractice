package creationalDesignPatterns.singletonPattern;

public class SingletonDemo {


    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}
