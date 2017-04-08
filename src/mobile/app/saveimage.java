/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.app;

import javax.naming.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 *
 * @author Steven
 */
public class saveimage {
    
    private String directoryName = "images";
    private String fileName = "image.png";
    private Context context;
    private boolean external;
    
    public saveimage(Context context){
        this.context = context;
    }
    
    public saveimage setFileName(String fileName){
        this.fileName = fileName;
        return this;
    }
    
    public saveimage setExternal(boolean external){
        this.external = external;
        return this;
    }
    
    public saveimage setDirectoryName(String directoryName){
        this.directoryName = directoryName;
        return this;
    }
    
  
}
