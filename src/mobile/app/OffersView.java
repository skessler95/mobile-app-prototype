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
public abstract class OffersView extends JPanel implements ActionListener{
    
    private JLabel imageLabel;
    private JButton uploadButton;
    
    OffersView(){
        
         GridLayout grid = new GridLayout(15,15);
         
         imageLabel = new JLabel(" ");
         add(imageLabel);
         
         uploadButton = new JButton("Upload");
         add(uploadButton);
         
         setLayout(grid);
        }
         public void addButtonListener(ActionListener al){
          uploadButton.addActionListener(al);
          
    
        }
         
         public JButton getUploadButton(){
             return uploadButton;
         }
         
         public void setUploadButton(JButton uploadButton){
             this.uploadButton = uploadButton;
         }
         
         public JLabel getImageLabel(){
             return imageLabel;
         }
         
         public ImageIcon setImageLabel(String imagePath){
             
             ImageIcon Myimage = new ImageIcon(imagePath);
             Image img = Myimage.getImage();
             Image newImg = img.getScaledInstance(imageLabel.getWidth() , imageLabel.getHeight() , Image.SCALE_SMOOTH);
             ImageIcon image = new ImageIcon(newImg);
             return image;
         }   
         
         @Override
         public void actionPerformed(ActionEvent e){
             
             if(uploadButton.isSelected()){
              
                 imageLabel.setEnabled(true);
             }
             else{
                 imageLabel.setEnabled(false);
             }
             
             JFileChooser file = new JFileChooser();
             file.setCurrentDirectory(new File(System.getProperty("user.home")));
             FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images","jpg","gif","png");
             file.addChoosableFileFilter(filter);
             int result = file.showSaveDialog(null);
             if(result == JFileChooser.APPROVE_OPTION){
                 File selectedFile = file.getSelectedFile();
                 String path = selectedFile.getAbsolutePath();
                 imageLabel.setIcon(setImageLabel(path));
             }
             else if(result == JFileChooser.CANCEL_OPTION){
                 System.out.println("No File Chosen");
             }
             
         }
    }
