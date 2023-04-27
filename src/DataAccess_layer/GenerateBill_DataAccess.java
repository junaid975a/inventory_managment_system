/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess_layer;

import Model_layer.GenerateBill;
import DB_classes.Item;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Junaid Ansari
 */
public class GenerateBill_DataAccess extends Main_DataAccess {
                
    public ArrayList<Item> showInv() {
            
            try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","junaid@111");
            st = (Statement) connection.createStatement();
            rs = st.executeQuery("select * from supermarket.product");
            
            ArrayList<Item> item=new ArrayList();
            String name="";
            int id=0;
            int price=0;
            int quant=0;
            int q=0;
            
            while(rs.next()) {         
                id=Integer.parseInt(rs.getString("prod_id"));
                price=rs.getInt("prod_price");
                quant=rs.getInt("prod_quantity");
                name=rs.getString("prod_name"); 
                q=rs.getInt("q");
                
                Item g=new Item(id,price,quant-q,name);
                item.add(g);
            }
                                    
            connection.close();
            return item;
            
            }catch (Exception e) {
                e.printStackTrace();
            }            
            return null;
        }

    public Item add(String id, String quant, String name, String price) {
        
        GenerateBill gb=new GenerateBill();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","junaid@111");

            String Query = "select * from supermarket.product where prod_id='"+id+"'";
            st = (Statement) connection.createStatement();
            rs = st.executeQuery(Query);
            int stock = 0,x=0;
            if(rs.next()) {
                stock= rs.getInt("prod_quantity");
                x=rs.getInt("q");
            }


            if(stock-x >= Integer.parseInt(quant)) {
                PreparedStatement add = connection.prepareStatement("update supermarket.product set q=? where prod_id=?;");
                // add.setInt(1, stock-Integer.parseInt(quant));
                add.setInt(1,x+Integer.parseInt(quant));
                add.setInt(2,Integer.parseInt(id));
                int row = add.executeUpdate();                   

                Item it=new Item(Integer.parseInt(id),Integer.parseInt(price),Integer.parseInt(quant),name);
                return it;
                
            } else {
                gb.show(3);
            }
        } catch( Exception e) {
            e.printStackTrace();
        }
        return null;
    }
        
    public void submit() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","junaid@111");
            st = (Statement) connection.createStatement();
            rs = st.executeQuery("Select * from supermarket.product");
            
            while(rs.next()) {
                PreparedStatement add = connection.prepareStatement("update supermarket.product set prod_quantity=?, q=? where prod_id=?"); 
                add.setInt(1, rs.getInt("prod_quantity")-rs.getInt("q"));
                add.setInt(2,0);
                add.setInt(3, rs.getInt("prod_id"));
                int row = add.executeUpdate();
            }
            
            
        } catch (Exception e) {        
            e.printStackTrace();
        }
    }
    
    public void clear_q() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","junaid@111");
            st = (Statement) connection.createStatement();
            PreparedStatement add = connection.prepareStatement("update supermarket.product set q=?"); 
            add.setInt(1, 0);
            int row = add.executeUpdate();
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
        
    }
        
    
}
