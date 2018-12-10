/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outlay3.code;

/**
 *
 * @author core i5
 */
public class Kategori {
   private Integer idKategori;
   private String namaKategori;
   private String warnaKategori;
   private String iconKategori;

   public void SetKategori(String nama, String warna, String icon){
       namaKategori = nama;
       warnaKategori = warna;
       iconKategori = icon;
   }
   
    public Integer getIdKategori() {
        return idKategori;
    }

    public String getNamaKategori() {
        return namaKategori;
    }

    public String getWarnaKategori() {
        return warnaKategori;
    }

    public String getIconKategori() {
        return iconKategori;
    }
   
   
   
}
