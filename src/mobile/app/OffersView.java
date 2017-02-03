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
public class OffersView extends JPanel{
    
    private JLabel offer1;
    
    OffersView(){
        
         GridLayout grid = new GridLayout(15,15);
         
         offer1 = new JLabel("Offer");
         add(offer1);
         
         setLayout(grid);
         
    }
}
