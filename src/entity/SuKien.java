/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author leanh
 */
public class SuKien {
    private String masukien;
    private String tensukien;
    private String mota;
    private int giamgia;

    public String getMasukien() {
        return masukien;
    }

    public void setMasukien(String masukien) {
        this.masukien = masukien;
    }

    public String getTensukien() {
        return tensukien;
    }

    public void setTensukien(String tensukien) {
        this.tensukien = tensukien;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getGiamgia() {
        return giamgia;
    }

    public void setGiamgia(int giamgia) {
        this.giamgia = giamgia;
    }

    public SuKien() {
    }

    public SuKien(String masukien, String tensukien, String mota, int giamgia) {
        this.masukien = masukien;
        this.tensukien = tensukien;
        this.mota = mota;
        this.giamgia = giamgia;
    }
    
    
}
