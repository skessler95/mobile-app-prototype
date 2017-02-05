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
public class SettingsView extends JPanel{
    
        private JLabel settings1;
        
        SettingsView(){
            
            GridLayout grid = new GridLayout(15,15);
            
            settings1 = new JLabel("Settings");
            add(settings1);
            
            setLayout(grid);
        }
}
