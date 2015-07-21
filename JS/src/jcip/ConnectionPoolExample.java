package jcip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPoolExample {

    private static ThreadLocal<Connection> connectionHolder = new ThreadLocal<Connection> () {
        public Connection initialValue() {
            Connection con = null;
            try {
                con = DriverManager.getConnection("DB_URL");
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return con;
            
        }
    };

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    
    public static Connection getConnection() {
        return connectionHolder .get();
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
