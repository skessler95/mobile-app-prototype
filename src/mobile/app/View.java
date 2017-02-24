/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.app;

import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Steven
 */
public class View extends JFrame{
    
    private NavViewPanel nVpanel;
    
    View(){
        super("App");
        this.setSize(1000, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        nVpanel = new NavViewPanel();
        
        add(nVpanel);
    }
    
    public void switchToHomePanel(HomeView h_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeOffers();
        nVpanel.removeStores();
        nVpanel.removePost();
        nVpanel.removeSettings();
        nVpanel.removeHome();
        nVpanel.addHome(h_view);
    }
    public void switchToOffersPanel(OffersView o_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeHome();
        nVpanel.removeStores();
        nVpanel.removePost();
        nVpanel.removeSettings();
        nVpanel.removeOffers();
        nVpanel.addOffers(o_view);
    }
    public void switchToStoresPanel(StoresView st_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeOffers();
        nVpanel.removeHome();
        nVpanel.removePost();
        nVpanel.removeSettings();
        nVpanel.removeStores();
        nVpanel.addStores(st_view);
    }
    public void switchToPostPanel(PostView p_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeHome();
        nVpanel.removeOffers();
        nVpanel.removeStores();
        nVpanel.removeSettings();
        nVpanel.removePost();
        nVpanel.addPost(p_view);
    }
    public void switchToSettingsPanel(SettingsView s_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeHome();
        nVpanel.removeOffers();
        nVpanel.removeStores();
        nVpanel.removePost();
        nVpanel.removeSettings();
        nVpanel.addSettings(s_view);
    }
    
    public void addHomeButtonListener(ActionListener al) 
    {    
        nVpanel.getMenu().getHomeButton().addActionListener(al);
    }    
    
    public void addOffersButtonListener(ActionListener al) 
    {    
        nVpanel.getMenu().getOffersButton().addActionListener(al);
    } 
    
    public void addStoresButtonListener(ActionListener al) 
    {    
        nVpanel.getMenu().getStoresButton().addActionListener(al);
    }  
    
    public void addPostButtonListener(ActionListener al) 
    {    
        nVpanel.getMenu().getPostButton().addActionListener(al);
    }   
    
    public void addSettingsButtonListener(ActionListener al) 
    {    
        nVpanel.getMenu().getSettingsButton().addActionListener(al);
    }  
    
}
