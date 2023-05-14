/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess_layer;

import Model_layer.AddItems;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 *
 * @author Junaid Ansari
 */
public class AddItems_DataAccess extends Main_DataAccess{
    
    AddItems ai=new AddItems();
    
    public int add_item(String name, String price, String quant) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","junaid@111");

            String Query = "select count(*) from supermarket.product where prod_name='"+name+"'";
            st = (Statement) connection.createStatement();
            rs = st.executeQuery(Query);
            int count = 0;
            if(rs.next())
            {
                count = rs.getInt(1);
            }
            if(count == 1){
                ai.show(2);
            }else {
                PreparedStatement add = connection.prepareStatement("INSERT INTO PRODUCT(prod_name, prod_price, prod_quantity"
                        + ",q) values(?,?,?,?)");
                add.setString(1, name);
                add.setInt(2,Integer.parseInt(price));
                add.setInt(3,Integer.parseInt(quant));
                add.setInt(4, 0);
                int row = add.executeUpdate();
                ai.show(3);

                connection.close();
                return 1;
            }
        } catch( Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
}
