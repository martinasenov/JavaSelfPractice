package creationalDesignPatterns.abstractFactoryPattern.example2;

public abstract class DatabaseConnection {

    public abstract void connect();

    public void disconnect() {
        System.out.println("Disconnecting from the database...");
    }
}
