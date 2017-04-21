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
public class OffersController {
    private OffersModel o_model;
    private OffersView o_view;
    private Image defaultimage;
    
    OffersController(OffersModel o_model, OffersView o_view){
        this.o_model = o_model;
        this.o_view = o_view;
        
        
        
        class ButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                JButton clickSource = (JButton)e.getSource();
                if(clickSource == o_view.getUploadButton()){
                    o_view.setImageLabel(null);
                }
            }
        }
        o_view.addButtonListener(new ButtonListener());
    }
    
}
