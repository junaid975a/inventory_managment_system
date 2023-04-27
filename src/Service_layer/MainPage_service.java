/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service_layer;

import DataAccess_layer.MainPage_DataAccess;

/**
 *
 * @author Junaid Ansari
 */
public class MainPage_service {

    public int logout() {
        MainPage_DataAccess mpda=new MainPage_DataAccess();
        return mpda.logout();
    }
    
    
    
}
