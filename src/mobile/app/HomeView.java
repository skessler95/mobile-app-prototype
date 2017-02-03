/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.app;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Steven
 */
public class HomeView extends JPanel{
    
    private JLabel home1;
    
    HomeView(){
        
         GridLayout grid = new GridLayout(15,15);
         
         home1 = new JLabel("Home");
         add(home1);
         
         setLayout(grid);
         
    }
}
