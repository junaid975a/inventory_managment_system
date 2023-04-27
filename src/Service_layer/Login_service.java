/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service_layer;

import DataAccess_layer.Login_DataAccess;

/**
 *
 * @author Junaid Ansari
 */
public class Login_service {

    public int login(String id, String pw, String loginType) {
        Login_DataAccess lda=new Login_DataAccess();
        return lda.login(id,pw,loginType);
    }
    
    
    
}
