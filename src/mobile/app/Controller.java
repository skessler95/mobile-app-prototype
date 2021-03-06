/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.app;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Steven
 */
public class Controller {
    
    private View view;
    
    private Clothing clothes;
    
    //Instance Variables for Home Model, View, and Controller
    private HomeModel h_model;
    private HomeView h_view;
    private HomeController h_controller;
    
     //Instance Variables for Offers Model, View, and Controller
    private OffersModel o_model;
    private OffersView o_view;
    private OffersController o_controller;
    
    private StoresView st_view;
    
    private PostView p_view;
    
    private SettingsView s_view;
    
    public Controller(View view){
        
        this.view = view;
        
        h_model = new HomeModel();
        h_view = new HomeView(h_model, o_model, o_view);
        h_controller = new HomeController(h_view, o_view, h_model);
        
        o_model = new OffersModel();
        o_view = new OffersView(o_model) {};
        o_controller = new OffersController(o_model, o_view, h_view, clothes);
        
        st_view = new StoresView();
        
        p_view = new PostView();
        
        s_view = new SettingsView();
        
        view.addHomeButtonListener(new HomeButtonListener());
        view.addOffersButtonListener(new OffersButtonListener());
        view.addStoresButtonListener(new StoresButtonListener());
        view.addPostButtonListener(new PostButtonListener());
        view.addSettingsButtonListener(new SettingsButtonListener());
    }
    
    class HomeButtonListener implements ActionListener {            
        @Override
        public void actionPerformed(ActionEvent e)
        {                 
                view.switchToHomePanel(h_view);        
        }
    }   
    
    class OffersButtonListener implements ActionListener {            
        @Override
        public void actionPerformed(ActionEvent e)
        {                 
                view.switchToOffersPanel(o_view);        
        }
    }  
    
    class StoresButtonListener implements ActionListener {            
        @Override
        public void actionPerformed(ActionEvent e)
        {                 
                view.switchToStoresPanel(st_view);        
        }
    } 
    
    class PostButtonListener implements ActionListener {            
        @Override
        public void actionPerformed(ActionEvent e)
        {                 
                view.switchToPostPanel(p_view);        
        }
    }  
    
    class SettingsButtonListener implements ActionListener {            
        @Override
        public void actionPerformed(ActionEvent e)
        {                 
                view.switchToSettingsPanel(s_view);        
        }
    }  
    
}
