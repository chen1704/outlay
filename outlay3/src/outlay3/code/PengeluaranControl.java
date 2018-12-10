/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outlay3.code;
import java.sql.*;

/**
 *
 * @author core i5
 */
public class PengeluaranControl {
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/outlay";
    
    public static void openHalamanPengeluaran(){
        HalamanPengeluaran hlm = new HalamanPengeluaran();
        hlm.setVisible(true);
    }
    
    public static void openFormDeskripsi(String id){
        FormDeskripsi form = new FormDeskripsi();
        form.setIdDeskripsi(id);
        form.setVisible(true);
    }
    
    public static void addPengeluaran(Pengeluaran peng){
        Connection con;
        Statement st;
        try{
            con = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            st = con.createStatement();
            String query = "insert into pengeluaran(id_kategori, id_deskripsi, nominal_pengeluaran,date) values('"+peng.getIdKategori()+"',500,'"+peng.getNominalPengeluaran()+"', SYSDATE())";
            st.executeUpdate(query);
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
    
    public static void addDeskripsi(Deskripsi desc){
        Connection con;
        Statement st;
        try{
            con = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            st = con.createStatement();
            String query = "insert into deskripsi(id_deskripsi, detail_deskripsi) values('"+desc.getIdDeskripsi()+"','"+desc.getDetailDeskripsi()+"')";
            st.executeUpdate(query);
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
    
    public static void editPengeluaran(Deskripsi desc){
        Connection con;
        Statement st;
        try{
            con = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            st = con.createStatement();
            String query = "update pengeluaran set id_deskripsi = '"+desc.getIdDeskripsi()+"' where id_kategori = '"+desc.getIdDeskripsi()+"'";
            st.executeUpdate(query);
            System.out.println("Hai");
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
    
}
