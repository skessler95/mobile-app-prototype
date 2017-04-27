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
public abstract class OffersView extends JPanel implements ActionListener{
    
    private JLabel image;
    private Color defaultimage;
    private String imagebackground;
    private JButton uploadButton;
    private JButton eraseButton;
    private JButton saveButton;
    private JLabel iButtonLabel;
    private OffersModel o_model;
    private JPanel content;
    private JPanel southCenter;
    
    OffersView(OffersModel o_model){
        
         
         this.o_model = o_model;
         
         content = new JPanel(new FlowLayout(FlowLayout.CENTER));
         defaultimage = getBackground();
         setLayout(new BorderLayout());
        
         iButtonLabel = new JLabel("Choose an image");
         image = new JLabel("");
         uploadButton = new JButton("Upload");
         eraseButton = new JButton("Erase");
         saveButton = new JButton("Save and Return");
        
         iButtonLabel.setFont(new Font("Aldhabi", Font.ITALIC, 20));
         add(iButtonLabel, BorderLayout.NORTH);
          
         content.add(image);
         Toolkit toolkit = Toolkit.getDefaultToolkit();
         content.setSize(toolkit.getScreenSize().width, toolkit.getScreenSize().height);
         int w = toolkit.getScreenSize().width;
         int h = toolkit.getScreenSize().height;
         content.setBounds(400, 425, 600, 600);
         image.setPreferredSize(new Dimension(700, 700));
         content.setVisible(true);
         add(content, BorderLayout.CENTER);
         add(content);
         
    
       JPanel southCenter = new JPanel(new FlowLayout(FlowLayout.CENTER));
       southCenter.setBounds(30, 30, 150, 60);
       southCenter.add(uploadButton);
       southCenter.add(eraseButton);
       southCenter.add(saveButton);
       uploadButton.setPreferredSize(new Dimension(110, 40));
       eraseButton.setPreferredSize(new Dimension(110, 40));
       saveButton.setPreferredSize(new Dimension(130, 40));
       add(southCenter, BorderLayout.SOUTH);
         
        
         }
    
        public void addButtonListener(ActionListener al){
        uploadButton.addActionListener(al);
        saveButton.addActionListener(al);
        }
         
        public void setImageField(String Image1) {
            Image1 = image.getText();
            o_model.setImage(Image1);
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
         
         public JButton getEraseButton(){
             return eraseButton;
         }
         
         public void setEraseButton(JButton eraseButton){
             this.eraseButton = eraseButton;
         }
         
         public JButton getSaveButton(){
             return saveButton;
         }
         
         public void setSaveButton(JButton saveButton){
             this.saveButton = saveButton;
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
             
          }
             
    }
    
