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
    private int user_Rate;
    
    Clothing(){
        
    }
    
    public void setName(String name){
        this.name = name;
    }
            
    public String getName(){
        return this.name;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setP_ID(int p_id){
        this.p_id = p_id;
    }
    
    public int getP_ID(){
        return this.p_id;
    }
    
    public void setUser_Rate(int user_Rate){
        this.user_Rate = user_Rate;
    }
    
    public int getUser_Rate(){
        return this.user_Rate;
    }
    
}
