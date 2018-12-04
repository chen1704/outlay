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
        Statement st = null;
        ResultSet rs = null;
        String query = "";
        try{
            cn = DriverManager.getConnection("jdbc:derby://localhost:1527/outlaydb", "test", "test");
            st = cn.createStatement();
            rs = st.executeQuery(query);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        return cn;
    }
}
