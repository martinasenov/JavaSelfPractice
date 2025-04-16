package creationalDesignPatterns.abstractFactoryPattern.example2;

public abstract class DatabaseFactory {

    public abstract DatabaseConnection createConnection();

    public void manageConnection(){
        DatabaseConnection connection=createConnection();
        connection.connect();

        connection.disconnect();
    }
}
