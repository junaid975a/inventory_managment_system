/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service_layer;

import DB_classes.Pos;
import DataAccess_layer.ViewPos_DataAccess;
import java.util.ArrayList;

/**
 *
 * @author Junaid Ansari
 */
public class ViewPos_service {

    public int logout() {
        ViewPos_DataAccess vpda=new ViewPos_DataAccess();
        return vpda.logout();
    }

    public ArrayList<Pos> showList() {
        ViewPos_DataAccess vpda=new ViewPos_DataAccess();
        return vpda.showList();
    }

    
    
}
