/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess_layer;

import DB_classes.Pos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Junaid Ansari
 */
public class ViewPos_DataAccess extends Main_DataAccess{

    public int logout() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","junaid@111");
            st = (Statement) connection.createStatement();
            st.executeUpdate("truncate table supermarket.loggedin");            
            return 1;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public ArrayList<Pos> showList() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","junaid@111");
            st = (Statement) connection.createStatement();
            rs = st.executeQuery("select * from supermarket.pos");
            
            String id="";
            String name="";
            String pw="";
            
            ArrayList<Pos> pos=new ArrayList();
            
            while(rs.next()) {
                id=rs.getString("pos_id");
                name=rs.getString("pos_name");
                pw=rs.getString("pos_pw");
                
                Pos p=new Pos(id,name,pw);
                pos.add(p);
                
            }
            connection.close();
            return pos;            
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
