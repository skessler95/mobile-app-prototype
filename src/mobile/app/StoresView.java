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
public class StoresView extends JPanel{
    
    private JLabel store1;
    
    StoresView(){
        
         GridLayout grid = new GridLayout(15,15);
         
         store1 = new JLabel("Store");
         add(store1);
         
         setLayout(grid);
         
    }
}
