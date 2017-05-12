/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.app;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Steven
 */
public class HomeController {
    private HomeView h_view;
    private OffersView o_view;
    private HomeModel h_model;
    private View view;
    
    
    private NavViewPanel nVpanel;
    
    HomeController(HomeView h_view, OffersView o_view, HomeModel h_model){
        this.h_view = h_view;
        this.h_model = h_model;
        this.o_view = o_view;
        
        class ButtonListener implements ActionListener{
            
            public void actionPerformed(ActionEvent e){
                
                JButton clickSource = (JButton)e.getSource();
                
                if(clickSource == h_view.getPreviousButton()){
                    int number = 0;
                    
                    number = number - 1;
                    
                    String imagepath = null;
                    ImageIcon image = o_view.setImageBackground(imagepath);
                    if(number >= 0){
                        number = h_view.getImages(imagepath).length - 1;
                    }
                    h_view.showImage(number);
                }
                if(clickSource == h_view.getNextButton()){
                    int number = 0;
                    
                    number = number - 1;
                    if(number < 0){
                        number = 0;
                    }
                    h_view.showImage(number);
                }
            }  
        }
        h_view.addButtonListener(new ButtonListener());
    }
}