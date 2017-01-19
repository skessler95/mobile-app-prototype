/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.app;

import javax.swing.*;

/**
 *
 * @author Steven
 */
public class NavViewBottomMenuPanel extends JPanel{
    private JButton homeButton;
    private JButton offersButton;
    private JButton storesButton;
    private JButton postButton; 
    private JButton settingsButton; 
    
    public NavViewBottomMenuPanel(){
        
        super();
        homeButton = new JButton("Home");
        offersButton = new JButton("Offers");
        storesButton = new JButton("Stores");
        postButton = new JButton("Post");
        settingsButton = new JButton("Settings");
        
        add(homeButton);
        add(offersButton);
        add( storesButton);
        add( postButton );
        add( settingsButton );
    }
    
    public JButton getHomeButton(){
     return homeButton;   
    }
    
    public void setHomeButton(JButton homeButton){
     this.homeButton = homeButton;   
    }
    
    public JButton getOffersButton(){
     return offersButton;   
    }
    
    public void setOffersButton(JButton offersButton){
     this.offersButton = offersButton;   
    }
    
    public JButton getStoresButton(){
     return storesButton;   
    }
    
    public void setStoresButton(JButton storesButton){
     this.storesButton = storesButton;   
    }
    
    public JButton getPostButton(){
     return postButton;   
    }
    
    public void setPostButton(JButton postButton){
     this.postButton = postButton;   
    }
    
    public JButton getSettingsButton(){
     return settingsButton;   
    }
    
    public void setSettingsButton(JButton settingsButton){
     this.settingsButton = settingsButton;   
    }
}
