package main.java.com.kafusoft.abarroteria.kinal.config;

public class Credentials {
    
    public static final String URL_DATA_BASE = System.getenv("URL_MYSQL_DB") + "/abarroteria_kinal_in4bv";
    public static final String USER_DB = System.getenv("USER_MYSQL_DB");
    public static final String PASS_DB = System.getenv("PASS_MYSQL_DB");
    
    private Credentials(){
    
    }
    
}
