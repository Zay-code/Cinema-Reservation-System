/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemasprintjava;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class CinemaSprintJava {

    public static int ID;
    public static Connection conn;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DBConnection();
        new SignIn().setVisible(true);
    }
    
    public static void DBConnection() {
        String serverhost = "garyperitus.dyndns.org";        
        String localhost = "localhost";
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://"+serverhost+":3306/cinema_system_db", "remote", "J4v4Gr0up1");
            System.out.println("Connection Successful!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Failed! " + e);
        }
    }
    
}
