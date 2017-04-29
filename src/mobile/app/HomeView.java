/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.app;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Steven
 */
public class HomeView extends JPanel{
    
    private JLabel menuLabel;
    
    private HomeModel h_model;
    private OffersModel o_model;
    private OffersView o_view;
    private JButton previousButton;
    private JButton nextButton;
    private JLabel image;
    private JLabel optionsLabel;
    private JLabel userName;
    private ImageIcon imagebackground;
    private JPanel content;
    
    
    HomeView(){
      
        this.h_model = h_model;
        
        content = new JPanel();
        
        setLayout(new BorderLayout());
        
       menuLabel = new JLabel("Welcome to The Look!");
       previousButton = new JButton("Previous");
       nextButton = new JButton("Next");
       
         
    }
}
