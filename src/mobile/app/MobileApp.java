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
public class MobileApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         View view = new View();
         Controller controller = new Controller(view);
         view.setVisible(true);
        
    }
    
}
