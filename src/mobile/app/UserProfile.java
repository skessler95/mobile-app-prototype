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
public class UserProfile {
    public String Username;
    public String Email;
    public String Password;
    
    UserProfile(){
        Username = this.Username;
        Email = this.Email;
        Password = this.Password;
    }
    
    public String getUsername(){
        return this.Username;
    }
    
    public String getEmail(){
        return this.Email;
    }
    
    public String getPassword(){
        return this.Password;
    }
}
