package creationalDesignPatterns.abstractFactoryPattern.example2;

public class PostgreSQLFactory extends  DatabaseFactory{

    @Override
    public DatabaseConnection createConnection() {
        return new PostgreSQLConnection();
    }
}
