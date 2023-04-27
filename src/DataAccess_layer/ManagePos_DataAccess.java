/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess_layer;

import Model_layer.ManagePos;
import DB_classes.Pos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Junaid Ansari
 */
public class ManagePos_DataAccess extends Main_DataAccess{

    public int delete(String id) {
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","junaid@111");               
                String Query = "delete from supermarket.pos where pos_id='"+id+"'";
                st = connection.createStatement();
                st.executeUpdate(Query);
                
                return 1;
            } catch(Exception e) {
                e.printStackTrace();
            }
        return 0;
    }

    public int update(String id,String name, String pw) {
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","junaid@111");
                String Query = "Update supermarket.pos set pos_name='"+name+"' ,pos_pw='"+pw+"' where pos_id='"+id+"'";
                st = connection.createStatement();
                st.executeUpdate(Query);
                               
                return 1;
            } catch(Exception e) {
                e.printStackTrace();
            }
        return 0;
    }
    
    public Pos search(String id) {
        ManagePos mps=new ManagePos();
        
        try {
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","junaid@111");
                st = (Statement) connection.createStatement();
            
                   int count = 0;
                   rs = st.executeQuery("select count(*) from supermarket.pos where pos_id='"+id+"'");
                   while(rs.next()) {
                        count = rs.getInt(1);
                    }
                if(count==1) {
                    rs = st.executeQuery("select pos_id as POS_ID, pos_name as Name, pos_pw as Password from supermarket.pos where pos_id='"+id+"'");
                    
                    String a="";
                    String b="";
                    String c="";
                    
                    while(rs.next()) {
                        a=rs.getString("POS_ID");
                        b=rs.getString("Name");
                        c=rs.getString("Password");
                    }
                    
                    Pos p=new Pos(a,b,c);
                    return p;
//                    searchedPOS.setModel(DbUtils.resultSetToTableModel(rs));
                } else {
                    mps.show(1);
                }
            
            } catch(Exception e) {
                e.printStackTrace();
            }
        return null;
    }

    
}
