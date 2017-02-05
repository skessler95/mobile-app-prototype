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
public class PostView extends JPanel{
    
      private JLabel post1;
        
        PostView(){
            
            GridLayout grid = new GridLayout(15,15);
            
            post1 = new JLabel("Post");
            add(post1);
            
            setLayout(grid);
        }
}
