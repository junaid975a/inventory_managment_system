/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess_layer;

import DB_classes.Item;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Junaid Ansari
 */
public class ViewInventory_DataAccess extends Main_DataAccess{

    public ArrayList<Item> showList() {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","junaid@111");
            st = (Statement) connection.createStatement();
            rs = st.executeQuery("select * from supermarket.product");
            
            int id=0;
            String name="";
            int price=0;
            int quant=0;
            
            ArrayList<Item> items=new ArrayList();
            
            while(rs.next()) {
                id=Integer.parseInt(rs.getString("prod_id"));
                name=rs.getString("prod_name");
                price=Integer.parseInt(rs.getString("prod_price"));
                quant=Integer.parseInt(rs.getString("prod_quantity"));                    
                
                Item i=new Item(id,price,quant,name);
                items.add(i);
            }
            connection.close();
            return items;
            
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
