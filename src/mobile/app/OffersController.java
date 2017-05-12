/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.app;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;

        
/**
 *
 * @author Steven
 */
public class OffersController {
    private OffersModel o_model;
    private OffersView o_view;
    private HomeView h_view;
    private Image defaultimage;
    Clothing clothes;
    
    OffersController(OffersModel o_model, OffersView o_view, HomeView h_view, Clothing clothes){
        this.o_model = o_model;
        this.o_view = o_view;
        this.h_view = h_view;
        this.clothes = clothes;
    
        
        
        class ButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                JButton clickSource = (JButton)e.getSource();
                if(clickSource == o_view.getUploadButton()){
                    JFileChooser file = new JFileChooser();
                    file.setCurrentDirectory(new File(System.getProperty("user.home")));
                    FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images","jpg","gif","png");
                    file.addChoosableFileFilter(filter);
                    int result = file.showSaveDialog(null);
                if(result == JFileChooser.APPROVE_OPTION){
                    File selectedFile = file.getSelectedFile();
                    String path = selectedFile.getAbsolutePath();
                    o_view.getImageBackground().setIcon(o_view.setImageBackground(path));  
               }
             else if(result == JFileChooser.CANCEL_OPTION){
                    System.out.println("No File Chosen");
                            }
                        }
               if(clickSource == o_view.getEraseButton()){
                    String file_delete_path = null;
                    File fileDelete = new File(file_delete_path);
                    if(fileDelete.exists()){
                        if(fileDelete.delete()){
                            System.out.println("File Deleted" + file_delete_path);
                        }else{
                            System.out.println("File Not Deleted" + file_delete_path);
                        }
                    }
                    //http://stackoverflow.com/questions/5914608/java-delete-an-imageicon
                        }
               if(clickSource == o_view.getSaveButton()){
                    o_view.setImageField(o_model.getImage());
                    o_model.setChanged(true);
//                    o_view.getImageBackground() == h_view.getImageBackground();
                    clothes.setUser_Rate(h_view.getOneButton().getDisplayedMnemonicIndex());
                    clothes.setUser_Rate(h_view.getTwoButton().getDisplayedMnemonicIndex());
                    clothes.setUser_Rate(h_view.getThreeButton().getDisplayedMnemonicIndex());
                    clothes.setUser_Rate(h_view.getFourButton().getDisplayedMnemonicIndex());
                    clothes.setUser_Rate(h_view.getFiveButton().getDisplayedMnemonicIndex());
                        }
                    }
                }
                o_view.addButtonListener(new ButtonListener());
            }
        }
       
