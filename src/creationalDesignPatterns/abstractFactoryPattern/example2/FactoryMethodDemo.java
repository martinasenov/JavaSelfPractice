package creationalDesignPatterns.abstractFactoryPattern.example2;

public class FactoryMethodDemo {


    public static void main(String[] args) {

        DatabaseFactory mySqlFactory=new MySQLFactory();
        mySqlFactory.manageConnection();

        DatabaseFactory postgreSqlFactory=new PostgreSQLFactory();
        postgreSqlFactory.manageConnection();

    }

}
