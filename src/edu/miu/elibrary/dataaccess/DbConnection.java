package edu.miu.elibrary.dataaccess;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Author: Kuylim TITH
 * Date: 9/25/2022
 */
public class DbConnection implements Serializable {

    private static Connection connection;
    private DbConnection() {
    }

    public static Connection getConnection() {
       if(Objects.isNull(connection)) {
           String conString = "jdbc:mysql://localhost:3306/library";
           try {
               //Class.forName("com.mysql.jdbc.Driver");
//               connection = DriverManager.getConnection(conString, "kuylim", "b9aFm@WX");
//               connection = DriverManager.getConnection(conString, "root", "Seav@0305");
               connection = DriverManager.getConnection(conString, "root", "Proseth@2612");
           }
//           catch (ClassNotFoundException ex) {
//               Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
//           }
           catch (SQLException ex) {
               Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       return connection;
    }
}
