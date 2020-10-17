package helpers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import constants.database;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zeref
 */

public class connectionDb {
    public static Connection con;
    public static Connection Con(){
        try {
            Class.forName(database.JDBC_DRIVER);
            con = DriverManager.getConnection(database.DB_URL,database.USER,database.PASS);
            System.out.println("Koneksi Sukses");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}
