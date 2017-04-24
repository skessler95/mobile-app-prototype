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
    
    private JLabel image;
    private String imagebackground;
    private JButton uploadButton;
    private OffersModel o_model;
    
    OffersView(OffersModel o_model){
        
   
         
         this.o_model = o_model;
         image = new JLabel(" ");
         add(image);
         
         uploadButton = new JButton("Upload");
         add(uploadButton);
         
         SetIcon();
         
         GridLayout grid = new GridLayout(15,15);
         
         setLayout(grid);
        }
    
        public void addButtonListener(ActionListener al){
          uploadButton.addActionListener(al);
        }
         
        public void setImageField(String Image1) {
            Image1 = image.getText();
            o_model.setImage(Image1);
         }
        
        public void SetIcon(){
    //        setImageBackground(Toolkit.getDefaultToolkit().getImage(getClass().getResource("IconImage.png")));
        }
         
         
         public JLabel getImageBackground(){
             return image;
         }
         
         public ImageIcon setImageBackground(String imagePath){
             ImageIcon Myimage = new ImageIcon(imagePath);
             Image img = Myimage.getImage();
             Image newImg = img.getScaledInstance(image.getWidth() , image.getHeight() , Image.SCALE_SMOOTH);
             ImageIcon image = new ImageIcon(newImg);
             return image;
         }   
         
         public JButton getUploadButton(){
            return uploadButton;   
        }
        
         public void setUploadButton(JButton uploadButton){
             this.uploadButton = uploadButton;
         }
         
         @Override
         public void actionPerformed(ActionEvent e){
             
             if(uploadButton.isSelected()){
              
                 image.setEnabled(true);
             }
             else{
                 image.setEnabled(false);
                 image.setText(imagebackground);
             }
             
             JFileChooser file = new JFileChooser();
             file.setCurrentDirectory(new File(System.getProperty("user.home")));
             FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images","jpg","gif","png");
             file.addChoosableFileFilter(filter);
             int result = file.showSaveDialog(null);
             if(result == JFileChooser.APPROVE_OPTION){
                 File selectedFile = file.getSelectedFile();
                 String path = selectedFile.getAbsolutePath();
                 image.setIcon(setImageBackground(path));
             }
             else if(result == JFileChooser.CANCEL_OPTION){
                 System.out.println("No File Chosen");
             }
             
         }
    }
