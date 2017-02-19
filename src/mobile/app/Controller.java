/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Steven
 */
public class Controller {
    
    private View view;
    
    private HomeView h_view;
    
    private OffersView o_view;
    
    private StoresView st_view;
    
    private PostView p_view;
    
    private SettingsView s_view;
    
    public Controller(View view){
        
        this.view = view;
        
        this.h_view = h_view;
        
        this.o_view = o_view;
        
        this.st_view = st_view;
        
        this.p_view = p_view;
        
        this.s_view = s_view;
        
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
