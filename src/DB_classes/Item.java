/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB_classes;

public class Item {
    
    private int id;
    private int price;
    private int quant;
    private String name;
    
    public Item(int i, int p, int q, String n) {
        id=i;
        price=p;
        quant=q;
        name=n;
    }
    
    public int get_id() {
        return id;
    }
    public int get_price() {
        return price;
    }
    public int get_quant() {
        return quant;
    }
    public String get_name() {
        return name;
    }
    
}


