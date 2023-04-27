/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service_layer;

import DataAccess_layer.UpdateUser_DataAccess;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Junaid Ansari
 */
public class UpdateUser_service {

    public int update(String id, String name, String pw) {
        
        UpdateUser_DataAccess uuda=new UpdateUser_DataAccess();
        return uuda.update(id, name, pw);
    }

    public String get_id() {
        UpdateUser_DataAccess uuda=new UpdateUser_DataAccess();
        return uuda.get_id();
    }

}
