/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.app;

/**
 *
 * @author Steven
 */
public class HomeModel {
      private String imagebackground;
      private String userName;
      private int userRating;
      
      HomeModel(){
          
      }
      
      public void setBackgroundImageName(String imagebackground){
          this.imagebackground = imagebackground;
      }
      
      public String getBackgroundImageName(){
          return imagebackground;
      }
      
      public void setUserRating(int userRating){
          this.userRating = userRating;
      }
      
      public int getUserRating(){
          return userRating;
      }
      
      public void setUserName(String userName){
          this.userName = userName;
      }
      
      public String getUserName(){
          return userName;
      }
}
