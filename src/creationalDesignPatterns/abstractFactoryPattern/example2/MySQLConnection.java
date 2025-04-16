package creationalDesignPatterns.abstractFactoryPattern.example2;

public class MySQLConnection extends DatabaseConnection{

    @Override
    public void connect() {
        System.out.println("Connecting to MySQL Database...");
    }
}
