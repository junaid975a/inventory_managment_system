/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service_layer;

import DataAccess_layer.AddItems_DataAccess;
import Model_layer.AddItems;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Junaid Ansari
 */
public class AddItems_service {
    
    AddItems ai=new AddItems();
    
    AddItems_DataAccess da=new AddItems_DataAccess();
    
    public int add(String name, String price, String quant) {
        if(name.isEmpty() || price.isEmpty() || quant.isEmpty())
        {
            ai.show(1);            
        }
        else {
            int x=da.add_item(name, price, quant);
            if(x==1)
                return 1;
        }
        return 0;
    }
    
}
