/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.app;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Steven
 */
public class ViewSplash extends JPanel {
    private JLabel splashLabel;
    private JLabel optionalLabel;
    
    ViewSplash(){
    splashLabel = new JLabel(new ImageIcon("src/images/app.jpg"));
    add(splashLabel);
    
    optionalLabel = new JLabel("The Look");
    add(optionalLabel);
    }
}
