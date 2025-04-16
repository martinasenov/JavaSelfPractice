package creationalDesignPatterns.abstractFactoryPattern.example2;

public class MySQLFactory extends DatabaseFactory{

    @Override
    public DatabaseConnection createConnection() {
        return new MySQLConnection();
    }

}
