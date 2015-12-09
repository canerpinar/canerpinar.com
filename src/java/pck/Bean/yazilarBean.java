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
import pck.Entity.Yazi;
import pck.Entity.Yazilar;

/**
 *
 * @author caner
 */
@ManagedBean
public class yazilarBean {
    
    List<Yazi> listeYazi=new ArrayList<>();

    
    public List<Yazi> getListeYazi() {        
        return listeYazi=new Yazilar().getYazilar();
    }

    public void setListeYazi(List<Yazi> listeYazi) {
        this.listeYazi = listeYazi;
    }

    @PostConstruct
    public void pageLoad(){
        getListeYazi();
    }
    
}
