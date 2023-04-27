/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess_layer;

import Model_layer.UpdateUser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Junaid Ansari
 */
public class UpdateUser_DataAccess extends Main_DataAccess{
    
    public int update(String id, String name, String pw) {
        UpdateUser uu=new UpdateUser();
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","junaid@111");
                
                st = (Statement) connection.createStatement();
                rs = st.executeQuery("select * from supermarket.loggedin;");
                String x="";
                
                while(rs.next())
                    x = rs.getString("id");
                
                if(x.equals(id)) {
                    String Query = "Update supermarket.pos set pos_name='"+name+"' ,pos_pw='"+pw+"' where pos_id='"+id+"'";
                    st.executeUpdate(Query);
            
                    uu.show(2);
                    return 1;
                }
                else {
                    uu.show(1);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        return 0;
    }

    public String get_id() {
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","junaid@111");
                
                st = (Statement) connection.createStatement();
                rs = st.executeQuery("select * from supermarket.loggedin;");
                String x = "";
                while(rs.next()) {
                    x = rs.getString("id");
                }
                return x;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return "";
    }
    
}
