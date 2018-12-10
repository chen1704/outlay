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
public class KategoriController {
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/outlay";
   private Kategori kategori;
   
   public static void openHalamanKategori(){
       HalamanKategori hlm = new HalamanKategori();
       hlm.setVisible(true);
   }
   
   public static void openFormKategori(){
       FormKategori form = new FormKategori();
       form.setVisible(true);
   }
   
   public static void addKategori(Kategori kategori){
       Connection con;
       Statement st;
       
       try{
           con = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
           st = con.createStatement();
           String query = "insert into kategori(nama_kategori, warna_kategori, icon_kategori) values('"+kategori.getNamaKategori()+"','"+kategori.getWarnaKategori()+"','"+kategori.getIconKategori()+"')";
           st.executeUpdate(query);
       }
       catch(Exception e){
           System.err.println(e);
       }
   }
   
   
}
