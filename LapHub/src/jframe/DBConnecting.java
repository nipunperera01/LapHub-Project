package jframe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnecting {
     
        static Connection con = null;
        
        public static Connection getConnection(){
         try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myshop","root","101010");
    
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

}
