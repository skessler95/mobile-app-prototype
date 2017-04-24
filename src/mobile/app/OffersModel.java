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
public class OffersModel {
    
    private String image;
    private String imagebackground;
    private boolean hasChanged;
    private boolean displayNames;
    
    OffersModel(){
        hasChanged = false;
    }
    
    public boolean getChanged(){
        return hasChanged;
    }
    
    public void setImage(String image){
        this.image = image;
    }
    
    public String getImage(){
        return image;
    }
    
    public void setChanged(boolean h){
        hasChanged = h;
    }
    
    public void setDisplayNames(boolean b){
        this.displayNames = b;
    }
    
    public boolean getDisplayNames(){
        return this.displayNames;
    }
    
    
}
