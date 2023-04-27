/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service_layer;

import DB_classes.Pos;
import DataAccess_layer.ManagePos_DataAccess;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Junaid Ansari
 */
public class ManagePos_service {

    public int delete(String id) {
        ManagePos_DataAccess mpda=new ManagePos_DataAccess();
        return mpda.delete(id);
    }

    public int update(String id,String name, String pw) {
     
        ManagePos_DataAccess mpda=new ManagePos_DataAccess();
        return mpda.update(id,name,pw);
        
    }

    public Pos search(String id) {
        
        ManagePos_DataAccess mpda=new ManagePos_DataAccess();
        return mpda.search(id);
        
    }

    
    
    
}
