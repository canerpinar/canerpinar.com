/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pck.Bean;

import com.sun.faces.facelets.tag.jsf.core.ConvertDateTimeHandler;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.Part;

/**
 *
 * @author caner
 */
@ManagedBean(name = "adminBean")
public class adminBean {
    
    private String path;
    private Part file;

    public Part getFile() {
        return file;
    }

    public void setFile(Part file) {
        this.file = file;
    }
    

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    public void savePicture() throws IOException{
    File f=new  File("/home/deneme.jpg");f.setWritable(true);f.setReadable(true);
        try {
            FileOutputStream fileOutputStream=new FileOutputStream(f);
            
            
            InputStream inputStream=file.getInputStream();
            byte[] dosya=new byte[4096];
            int readByte=0;
            while(true){
                readByte=inputStream.read(dosya);
                if(readByte>0){
                    fileOutputStream.write(dosya,0,readByte);
                }
                else
                    break;
            }
            
            String URL=FacesContext.getCurrentInstance().getExternalContext().getRequestServletPath();
            path=URL;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(adminBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
