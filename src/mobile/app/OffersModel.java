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
    
    private String imagebackground;
    private boolean hasChanged;
    
    OffersModel(){
        hasChanged = false;
    }
    
    public boolean getChanged(){
        return hasChanged;
    }
    
    public void setChanged(boolean h){
        hasChanged = h;
    }
}
