package main.java.com.kafusoft.abarroteria.kinal.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    
    private static Connection connection;
    
    private DataBaseConnection(){}
    
    public static Connection getDataBaseConnection()throws SQLException{
        
        if(connection == null || connection.isClosed()){
            connection = DriverManager.getConnection(Credentials.URL_DATA_BASE, Credentials.USER_DB, Credentials.PASS_DB);
        }
       
        return connection;
    }
    
}
