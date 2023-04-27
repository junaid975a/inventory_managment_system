/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess_layer;

import Model_layer.EditItem;
import DB_classes.Item;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Junaid Ansari
 */
public class EditItem_DataAccess extends Main_DataAccess{
    
    EditItem ei=new EditItem();
    
    public Item search(String id) {
        
        
        try {            
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","junaid@111");
            st = (Statement) connection.createStatement();
                     
            int count = 0;
            rs = st.executeQuery("select count(*) from supermarket.product where prod_id='"+id+"'");
            while(rs.next()) {
                 count = rs.getInt(1);
             }
            
            if(count==1) {
                
                try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","junaid@111");
                st = (Statement) connection.createStatement();
                rs = st.executeQuery("select prod_id as ID, prod_name as Name, prod_price as Price, prod_quantity as Quantity from supermarket.product where prod_id='"+id+"'");
                
                String name="";
                int ide=0;
                int price=0;
                int quant=0;
                
                while(rs.next()) {
                    name=rs.getString("Name");
                    ide=rs.getInt("ID");
                    price=rs.getInt("Price");
                    quant=rs.getInt("Quantity");
                }
                
                Item it=new Item(ide,price,quant,name);
                return it;
                
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
                return null;
                
                //return 1;
                
            } else {
                ei.show(1);
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public int delete(String id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");            
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","junaid@111");
            String Query = "delete from supermarket.product where prod_id='"+id+"'";
            st = connection.createStatement();
            st.executeUpdate(Query);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    
    public Item modify(String id,String name,String price, String quant) {
                
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","junaid@111");
            String Query = "Update supermarket.product set prod_name='"+name+"' ,prod_price='"+price+"' ,prod_quantity='"+quant+"' where prod_id='"+id+"'";
            st = connection.createStatement();
            st.executeUpdate(Query);
            
            rs = st.executeQuery("select prod_id as ID, prod_name as Name, prod_price as Price, prod_quantity as Stock from supermarket.product where prod_id='"+id+"'");
            
            String nam="";
            int ide=0;
            int pric=0;
            int quan=0;

            while(rs.next()) {
                nam=rs.getString("Name");
                ide=rs.getInt("ID");
                pric=rs.getInt("Price");
                quan=rs.getInt("Stock");
            }

            Item it=new Item(ide,pric,quan,nam);
            return it;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
}
