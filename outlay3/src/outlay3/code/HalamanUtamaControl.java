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
public class HalamanUtamaControl {
    public static void openHalamanKategori(){
        HalamanKategori hlm = new HalamanKategori();
        hlm.setVisible(true);
    }
    
    public static void openFormPengeluaran(){
        FormPengeluaran form = new FormPengeluaran();
        form.setVisible(true);
    }
    
    public static void openHalamanPengeluaran(){
        HalamanPengeluaran hlm = new HalamanPengeluaran();
        hlm.setVisible(true);
    }
    
    public static void openHalamanUtama(){
        HalamanUtama hlm = new HalamanUtama();
        hlm.setVisible(true);
    }
}
