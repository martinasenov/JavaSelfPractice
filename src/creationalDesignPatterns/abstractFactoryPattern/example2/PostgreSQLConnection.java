package creationalDesignPatterns.abstractFactoryPattern.example2;

public class PostgreSQLConnection extends DatabaseConnection {

    @Override
    public void connect() {
        System.out.println("Connecting to PostgreSQL Database...");
    }
}
