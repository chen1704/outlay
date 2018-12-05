/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outlay2.db;

import java.sql.*;
/**
 *
 * @author core i5
 */
public class connector {
    public static Connection getConnection() throws Exception{
        Connection cn = null;
        try{
            cn = DriverManager.getConnection("jdbc:sqlite:D:/outlay.db");
            System.out.println("success");
        }
        catch(SQLException e){
            System.out.println("failed");
        }
        
        return cn;
    }
    
    
}
