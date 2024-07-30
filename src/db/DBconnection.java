package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
     private static DBconnection dBConnection;
    private static Connection connection =null;

    private DBconnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryabc", "root", "Tharisen.1");
    }

    public static DBconnection getInstance() throws ClassNotFoundException, SQLException {
        return (dBConnection == null) ? (dBConnection = new DBconnection()) : dBConnection;
    }

    public static Connection getConnection() {
        return connection;

}
}