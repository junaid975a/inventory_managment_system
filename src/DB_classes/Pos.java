/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB_classes;

/**
 *
 * @author Junaid Ansari
 */
public class Pos {
    private String id;
    private String name;
    private String pass;
    
    public Pos(String a, String b, String c) {
        id=a;
        name=b;
        pass=c;
    }
    
    public String get_id() {
        return id;
    }
    public String get_name() {
        return name;
    }
    public String get_pass() {
        return pass;
    }
}
