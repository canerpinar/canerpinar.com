/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pck.Bean;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.naming.NamingException;
import pck.Entity.Yazilar;

/**
 *
 * @author caner
 */
@ManagedBean
public class yazilar {
    
    List listeYazi=new ArrayList<>();

  
    public List<Yazilar> getListeYazi() {
        return listeYazi;
    }

    public void setListeYazi(List<Yazilar> listeYazi) {
        this.listeYazi = listeYazi;
    }
    
 
    
}
