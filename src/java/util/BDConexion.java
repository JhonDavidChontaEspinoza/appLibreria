/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author DS
 */
public class BDConexion {
    
    public static Connection getConnection() {
        Connection cn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/BDLibreria", "root", "123");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        return cn;
                
    }
}
