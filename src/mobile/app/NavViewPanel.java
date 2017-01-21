/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.app;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Steven
 */
public class NavViewPanel extends JPanel{
    private NavViewBottomMenuPanel menu;
    private ViewSplash splash;
    
    public NavViewPanel(){
        super();
        setLayout(new BorderLayout());
        menu = new NavViewBottomMenuPanel();
        splash = new ViewSplash();
        
        add(menu, BorderLayout.SOUTH);
        add(splash, BorderLayout.CENTER);
    }
}
