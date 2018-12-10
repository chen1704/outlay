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
public class Pengeluaran {
    private Integer idPengeluaran;
    private Integer nominalPengeluaran;
    private Integer idKategori;
    private Integer idDeskripsi;

    public Integer getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(Integer idKategori) {
        this.idKategori = idKategori;
    }

    public Integer getIdDeskripsi() {
        return idDeskripsi;
    }

    public void setIdDeskripsi(Integer idDeskripsi) {
        this.idDeskripsi = idDeskripsi;
    }
    
    public Integer getIdPengeluaran() {
        return idPengeluaran;
    }

    public void setIdPengeluaran(Integer idPengeluaran) {
        this.idPengeluaran = idPengeluaran;
    }

    public Integer getNominalPengeluaran() {
        return nominalPengeluaran;
    }

    public void setNominalPengeluaran(Integer nominalPengeluaran) {
        this.nominalPengeluaran = nominalPengeluaran;
    }
    
    
}
