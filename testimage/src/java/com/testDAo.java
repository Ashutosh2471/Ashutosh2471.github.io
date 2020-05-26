/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.sql.*;

/**
 *
 * @author ashu
 */
public class testDAo {
//    step5=Dao me operation perform karege like save,update,delete,insert.Aur ye Entities wale class se user ka dat fetch karega

   private Connection con;

    public testDAo(Connection con) {
        this.con = con;
    }
    public boolean savetest(Test test){
        boolean f=false;
        try {
            String q="insert into user(name,profile) values(?,?) ; ";
            PreparedStatement p=this.con.prepareStatement(q);
            p.setString(1, test.getName());
            p.setString(2, test.getProfile());
            p.executeUpdate();
            f=true;
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        return f;
    }

    
}
