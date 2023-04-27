/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service_layer;

import DataAccess_layer.AddPos_DataAccess;
import Model_layer.AddPos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Junaid Ansari
 */
public class AddPos_service {
    
    AddPos_DataAccess apd=new AddPos_DataAccess();
    AddPos ap=new AddPos();
    
    public int add(String id, String name, String pass) {
        if(id.isEmpty() || name.isEmpty() || pass.isEmpty())
        {
            ap.show(1);
        }
        else {
            int x=apd.add(id,name,pass);
            if(x==1)
                return 1;
        }
        return 0;
    }
    
}
