/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pck.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import pck.Entity.Yazilar;

/**
 *
 * @author caner
 */
public class DAO {
    
    InitialContext initContext=null;
    Context envContext=null;
    DataSource ds=null;
    Connection conn=null;
    Statement statement=null;
            
    public DAO() throws NamingException, SQLException{
            initContext = new InitialContext();
            envContext  = (Context)initContext.lookup("java:comp/env/");
            ds = (DataSource)envContext.lookup("jdbc/Test");
            conn = ds.getConnection();            
            statement=conn.createStatement();    
    }
    
    public ResultSet getYazilar() throws SQLException{                
        ResultSet set=statement.executeQuery("select *from yazilar");
        return set;
    }
}
