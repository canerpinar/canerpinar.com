/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pck.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;
import pck.DB.DAO;

/**
 *
 * @author caner
 */
public class Yazilar {
    
    private List<Yazi> listYazilar=new ArrayList<>();    
    public List<Yazi> getYazilar() throws NamingException, SQLException{
        DAO dao=new DAO();
        ResultSet resultSet=dao.getYazilar();
        
        while(resultSet.next()){
            Yazi yazi=new Yazi();
            yazi.setId(Integer.parseInt(resultSet.getString(1)));
            yazi.setBaslik(resultSet.getString(2));
            yazi.setContent(resultSet.getString(3));
            yazi.setLink(resultSet.getString(4));
            listYazilar.add(yazi);            
        }
        resultSet.close();
    return listYazilar;    
    }
}

class Yazi{

    private int id;
    private String baslik;
    private String content;
    private String link;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
                
}
