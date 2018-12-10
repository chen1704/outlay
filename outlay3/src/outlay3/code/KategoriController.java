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
   
   public static void openFormEditKategori(Kategori kategori){
       FormEditKategori form = new FormEditKategori();
       form.setKategori(kategori);
       form.setVisible(true);
   }
   
   public static Kategori setKategori(String id){
       Connection con;
       Statement st;
       System.out.println(id);
       try{
            con = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            st = con.createStatement();
            //String query = "insert into kategori(nama_kategori, warna_kategori, icon_kategori) values('"+kategori.getNamaKategori()+"','"+kategori.getWarnaKategori()+"','"+kategori.getIconKategori()+"')";
            //Connection cn = outlay2.db.connector.getConnection();
            String query = "select * from kategori where id_kategori = '"+id+"'";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            rs.first();
            
            Integer idn = Integer.parseInt(rs.getString("id_kategori"));
            String nama = rs.getString("nama_kategori");
            String warna = rs.getString("warna_kategori");
            String icon = rs.getString("icon_kategori");
            
            System.out.println(idn);
            
            
            Kategori ktgr = new Kategori();
            ktgr.setId(idn);
            ktgr.SetKategori(nama, warna, icon);
            
            return ktgr;
       }
       catch(Exception e){
           System.err.println(e);
           return null;
       }
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
   
   public static void editKategori(Kategori kategori){
       Connection con;
       Statement st;
       try{
           con = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
           st = con.createStatement();
           String query = "update kategori set nama_kategori = '"+kategori.getNamaKategori()+"', warna_kategori = '"+kategori.getWarnaKategori()+"', icon_kategori = '"+kategori.getIconKategori()+"' where id_kategori= '"+kategori.getIdKategori()+"'";
           st.executeUpdate(query);
           
       }
       catch(Exception e){
           System.err.println(e);
       }
   }
   
   public static void deleteKategori(Integer id){
       Connection con;
       Statement st;
       try{
           con = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
           st = con.createStatement();
           String query = "delete from kategori where id_kategori = '"+id+"'";
           st.executeUpdate(query);
       }
       catch (Exception e){
           System.err.println(e);
       }
   }
}
