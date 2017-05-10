/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Steven
 */
public class HomeView extends JPanel implements ActionListener{
    
    private JLabel menuLabel;
    
    private HomeModel h_model;
    private OffersModel o_model;
    private OffersView o_view;
    private JButton previousButton;
    private JButton nextButton;
    private JLabel image;
    private JLabel optionsLabel;
    private ImageIcon imagebackground;
    private JRadioButton userRate1;
    private JRadioButton userRate2;
    private JRadioButton userRate3;
    private JRadioButton userRate4;
    private JRadioButton userRate5;
    private JPanel content;
    private JPanel westSide;
    private JPanel eastSide;
    private JPanel southCenter;
    private ButtonGroup group;
    private Color defaultimage;
    Clothing clothes;
    
    
    HomeView(HomeModel h_model, OffersModel o_model, OffersView o_view){
      
        //http://stackoverflow.com/questions/19697996/adding-the-same-components-to-multiple-panels
        
        this.h_model = h_model;
        this.o_model = o_model;
        this.o_view = o_view;
        
        content = new JPanel(new FlowLayout(FlowLayout.CENTER));
        defaultimage = getBackground();
        setLayout(new BorderLayout());
        
       menuLabel = new JLabel("Explore");
       previousButton = new JButton("Previous");
       nextButton = new JButton("Next");
       
       optionsLabel = new JLabel("How do you like this look?");
       image = new JLabel("");
       imagebackground = new ImageIcon();
       
       userRate1 = new JRadioButton("1");
       userRate1.addActionListener(this);
       userRate2 = new JRadioButton("2");
       userRate2.addActionListener(this);
       userRate3 = new JRadioButton("3");
       userRate3.addActionListener(this);
       userRate4 = new JRadioButton("4");
       userRate4.addActionListener(this);
       userRate5 = new JRadioButton("5");
       userRate5.addActionListener(this);
       group = new ButtonGroup();
       group.add(userRate1);
       group.add(userRate2);
       group.add(userRate3);
       group.add(userRate4);
       group.add(userRate5);
       
       add(menuLabel, BorderLayout.NORTH);
       menuLabel.setFont(new Font("Aldhabi", Font.ITALIC, 20));
  
       
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
        
        JPanel westSide = new JPanel(new FlowLayout(FlowLayout.LEFT));
        westSide.setBounds(30, 200, 110, 40);
        westSide.add(previousButton);
        previousButton.setPreferredSize(new Dimension(110, 40));
        add(westSide, BorderLayout.WEST);
        
        JPanel eastSide = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        eastSide.setBounds(820, 200, 110, 40);
        eastSide.add(nextButton);
        nextButton.setPreferredSize(new Dimension(110, 40));
        add(eastSide, BorderLayout.EAST);
     
         JPanel southCenter = new JPanel(new FlowLayout(FlowLayout.CENTER));
         southCenter.setBounds(30, 30, 150, 60);
         southCenter.add(optionsLabel);
         southCenter.add(userRate1);
         southCenter.add(userRate2);
         southCenter.add(userRate3);
         southCenter.add(userRate4);
         southCenter.add(userRate5);
         userRate1.setPreferredSize(new Dimension(80, 30));
         userRate2.setPreferredSize(new Dimension(80, 30));
         userRate3.setPreferredSize(new Dimension(80, 30));
         userRate4.setPreferredSize(new Dimension(80, 30));
         userRate5.setPreferredSize(new Dimension(80, 30));
         optionsLabel.setFont(new Font("Aldhabi", Font.ITALIC, 16));
         add(southCenter, BorderLayout.SOUTH);
         
    }

    
    public void addButtonListener(ActionListener al){
       previousButton.addActionListener(al);
       nextButton.addActionListener(al);
    }
    
    public void setContent(JPanel content){
        this.content = content;
    }
    
    public JPanel getContent(){
      return content;  
    }
    
    public void setWestSide(JPanel westSide){
        this.westSide = westSide;
    }
    
    public JPanel getWestSide(){
      return westSide;  
    }
    
    public void setEastSide(JPanel eastSide){
        this.eastSide = eastSide;
    }
    
    public JPanel getEastSide(){
      return eastSide;  
    }
    
    public void setSouthCenter(JPanel southCenter){
        this.southCenter = southCenter;
    }
    
    public JPanel getSouthCenter(){
      return southCenter;  
    }
    
    public void setMenuLabel(JLabel menuLabel){
        this.menuLabel = menuLabel;
    }
    
    public JLabel getMenuLabel(){
        return menuLabel;
    }
    
    
    public void setPreviousButton(JButton previousButton){
        this.previousButton = previousButton;
    }
    
    public JButton getPreviousButton(){
        return previousButton;
    }
    
    public void setNextButton(JButton nextButton){
        this.nextButton = nextButton;
    }
    
    public JButton getNextButton(){
        return nextButton;
    }
    
    public ImageIcon setImageBackground(String imagePath){
        ImageIcon Myimage = new ImageIcon(imagePath);
        Image img = Myimage.getImage();
        Image newImg = img.getScaledInstance(image.getWidth() , image.getHeight() , Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }   
    
    public JLabel getImageBackground(){
        return image;
    }
    
    public JRadioButton getOneButton(){
        return userRate1;
    }
    
    public JRadioButton getTwoButton(){
        return userRate2;
    }
    
    public JRadioButton getThreeButton(){
        return userRate3;
    }
    
    public JRadioButton getFourButton(){
        return userRate4;
    }
    
    public JRadioButton getFiveButton(){
        return userRate5;
    }
    
    public boolean showUserOpinion(){
        if(userRate1.isSelected()){
            return true;
        }
        else if(userRate2.isSelected()){
            return true;
        }
        else if(userRate3.isSelected()){
            return true;
        }
        else if(userRate4.isSelected()){
            return true;
        }
        else if(userRate5.isSelected()){
            return true;
        }
        else{
            return false;
        }
    }
 
//    https://www.youtube.com/watch?v=OTTIsOSzSts
    
    
    public String [] getImages(){
        String imagePath = null;
        File file = new File(o_view.getClass().getResource(imagePath).getFile());
        String[] imageList = file.list();
        return imageList;
    }
    
    public void showImage(int index){
        String imagePath = null;
        String [] imageList = getImages();
        String imageName = imageList[index];
        ImageIcon icon = new ImageIcon(o_view.getClass().getResource(imagePath + imageName));
        Image image = icon.getImage().getScaledInstance(o_view.getImageBackground().getWidth(), o_view.getImageBackground().getHeight(), Image.SCALE_SMOOTH);
        o_view.getImageBackground().setIcon(new ImageIcon(image));
    }

//    http://www.dreamincode.net/forums/topic/116324-set-radiobutton-value/
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(h_model.getUserRating() == 1){
            userRate1.setSelected(true);
        }
        else if(h_model.getUserRating() == 2){
           userRate2.setSelected(true);
        }
        else if(h_model.getUserRating() == 3){
           userRate3.setSelected(true);
        }
        else if(h_model.getUserRating() == 4){
           userRate4.setSelected(true);  
        }
        else if(h_model.getUserRating() == 5){
           userRate5.setSelected(true);  
        }
        else{
           userRate1.setSelected(false);
           userRate2.setSelected(false); 
           userRate3.setSelected(false); 
           userRate4.setSelected(false); 
           userRate5.setSelected(false); 
        }
    }

}
