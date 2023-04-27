/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service_layer;

import DB_classes.Item;
import DataAccess_layer.EditItem_DataAccess;
import Model_layer.EditItem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Junaid Ansari
 */
public class EditItem_service {
    
    EditItem_DataAccess eid=new EditItem_DataAccess();
    EditItem ei=new EditItem();
    
    public Item search(String id) {        
        return eid.search(id);        
    }
    public int delete(String id) {
        if(id.isEmpty())
            ei.show(2);        
        return eid.delete(id);
    }
    public Item modify(String id,String name,String price, String quant) {
        if(id.isEmpty() || name.isEmpty() ||  price.isEmpty() || quant.isEmpty())
            ei.show(3);
        else
            return eid.modify(id,name,price,quant);
        return null;
    }

    
}
