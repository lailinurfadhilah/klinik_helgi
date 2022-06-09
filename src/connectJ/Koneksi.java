/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectJ;

import java.sql.*;

/**
 *
 * @author Laili
 */
public class Koneksi {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_klinikhelgi", "root", "");
            return con;
        } catch(Exception e){
            return null;
        }
} 
}
