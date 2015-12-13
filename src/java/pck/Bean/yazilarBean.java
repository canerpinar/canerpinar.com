/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pck.Bean;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import pck.Entity.Yazi;
import pck.Entity.Yazilar;

/**
 *
 * @author caner
 */
@ManagedBean(name = "yazilarBean")
@ApplicationScoped
public class yazilarBean {
    
    List<Yazi> listeYazi=new ArrayList<>();
    String yaziContent;

    public String getYaziContent() {
        return yaziContent;
    }

    public void setYaziContent(String yaziContent) {
        this.yaziContent = yaziContent;
    }
    
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
    
    public String getYaziLink(Yazi yazi){
        yaziContent=yazi.getContent();
        return "blog.xhtml?faces-redirect=true&yazi="+yazi.getLink();
    }
    
}
