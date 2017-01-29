/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.app;

/**
 *
 * @author Steven
 */
public class Clothing {
    private String name;
    private String color;
    private int p_id;
    
    Clothing(String name, String color, int p_id){
        this.name = name;
        this.color = color;
        this.p_id = p_id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public int getP_ID(){
        return this.p_id;
    }
}
