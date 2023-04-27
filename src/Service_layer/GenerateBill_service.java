/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service_layer;

import DB_classes.Item;
import DataAccess_layer.GenerateBill_DataAccess;
import java.util.ArrayList;

/**
 *
 * @author Junaid Ansari
 */
public class GenerateBill_service {

    public ArrayList<Item> showInv() {
        GenerateBill_DataAccess gbda=new GenerateBill_DataAccess();
        return gbda.showInv();
    }
    
    public Item add(String id, String quant, String name, String price) {
        GenerateBill_DataAccess gbda=new GenerateBill_DataAccess();
        return gbda.add(id,quant,name,price);
    }

    public void submit() {
        GenerateBill_DataAccess gbda=new GenerateBill_DataAccess();
        gbda.submit();
    }

    public void clear_q() {
        GenerateBill_DataAccess gbda=new GenerateBill_DataAccess();
        gbda.clear_q();
    }

    

    

    
    
    
    
}
