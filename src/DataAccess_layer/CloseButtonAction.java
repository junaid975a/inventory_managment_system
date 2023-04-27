/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess_layer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Junaid Ansari
 */
public class CloseButtonAction extends Main_DataAccess{
    
    public CloseButtonAction() {
        try {            
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","junaid@111");
            st = (Statement) connection.createStatement();
            st.executeUpdate("truncate table supermarket.loggedin");
            System.exit(0);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
