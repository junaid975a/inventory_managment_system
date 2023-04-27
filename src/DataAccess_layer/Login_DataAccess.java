/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess_layer;

import Model_layer.Login;
import Model_layer.MainPage;
import Model_layer.ViewPos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Junaid Ansari
 */
public class Login_DataAccess extends Main_DataAccess{

    public int login(String id, String pw, String loginType) {
        Login log=new Login();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","junaid@111");
            st = (Statement) connection.createStatement();


            // login to pos
            if(loginType.equals("Pos")) {
                rs = st.executeQuery("select * from supermarket.pos where pos_id='"+id+"'");
                if(!rs.next()) {
                    log.show(1);
                } else {
                    rs = st.executeQuery("select * from supermarket.pos where pos_id='"+id+"'");
                    if(rs.next()) {
                        String admin_id = rs.getString("pos_id"); 
                        String admin_pw = rs.getString("pos_pw");
                        if(admin_id.equals(id) && admin_pw.equals(pw)) {
                            st.executeUpdate("insert into supermarket.loggedin (id,pw) values ('"+id+"','"+pw+"')");
                            return 1;
                        } else {
                            log.show(2);
                        }              
                    }
                }
                // login to admin
            } else if(loginType.equals("Admin")) {
                rs = st.executeQuery("select * from supermarket.admin where admin_id='"+id+"'");  
                if(!rs.next()) {
                    log.show(1); 
                } else {
                    rs = st.executeQuery("select * from supermarket.admin where admin_id='"+id+"'");
                    if(rs.next()) {
                        String admin_id = rs.getString("admin_id"); 
                        String admin_pw = rs.getString("admin_pw");
                        if(admin_id.equals(id) && admin_pw.equals(pw)) {
                            st.executeUpdate("insert into supermarket.loggedin (id,pw) values ('"+id+"','"+pw+"')");
                            return 2;
                        } else {
                            log.show(2);
                        }           
                    }
                }
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
