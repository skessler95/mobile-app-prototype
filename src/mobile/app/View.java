/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.app;

import javax.swing.JFrame;

/**
 *
 * @author Steven
 */
public class View extends JFrame{
    
    private NavViewPanel nVpanel;
    
    View(){
        super();
        this.setSize(1000, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        nVpanel = new NavViewPanel();
        
        add(nVpanel);
    }
}
