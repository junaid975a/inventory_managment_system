/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess_layer;

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
public class AddPos_DataAccess extends Main_DataAccess{
    
    AddPos ap=new AddPos();
    
    public int add(String id, String name, String pass) {
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","junaid@111");
                
                String Query = "select count(*) from supermarket.pos where pos_id='"+id+"'";
                st = (Statement) connection.createStatement();
                rs = st.executeQuery(Query);
                int count=0;
                while(rs.next()) {
                    count = rs.getInt(1);
                }
                
                if(count==1) {
                    ap.show(2);
                } else {
                    PreparedStatement add = connection.prepareStatement("INSERT INTO supermarket.pos(pos_id, pos_name, pos_pw) values(?,?,?)");
                    add.setString(1, id);
                    add.setString(2,name);
                    add.setString(3,pass);
                    int row = add.executeUpdate();
                    ap.show(3);
                                    
                    connection.close();
                    return 1;
                }
            } catch( Exception e) {
                e.printStackTrace();
            }
        return 0;
    }
    
}
