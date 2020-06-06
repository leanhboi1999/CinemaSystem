/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author leanh
 */
public class Ve {
    private String mave;
    private String masuatchieu;
    private String manhanvien;
    private String masukien;
    private String mahoivien;
    private String maghe;
    private Date ngaylap;
    private int giave;
    private int diemtichluy;

    public String getMave() {
        return mave;
    }

    public void setMave(String mave) {
        this.mave = mave;
    }

    public String getMasuatchieu() {
        return masuatchieu;
    }

    public void setMasuatchieu(String masuatchieu) {
        this.masuatchieu = masuatchieu;
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getMasukien() {
        return masukien;
    }

    public void setMasukien(String masukien) {
        this.masukien = masukien;
    }

    public String getMahoivien() {
        return mahoivien;
    }

    public void setMahoivien(String mahoivien) {
        this.mahoivien = mahoivien;
    }

    public String getMaghe() {
        return maghe;
    }

    public void setMaghe(String maghe) {
        this.maghe = maghe;
    }

    public Date getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(Date ngaylap) {
        this.ngaylap = ngaylap;
    }

    public int getGiave() {
        return giave;
    }

    public void setGiave(int giave) {
        this.giave = giave;
    }

    public int getDiemtichluy() {
        return diemtichluy;
    }

    public void setDiemtichluy(int diemtichluy) {
        this.diemtichluy = diemtichluy;
    }

    public Ve(String mave, String masuatchieu, String manhanvien, String masukien, String mahoivien, String maghe, Date ngaylap, int giave, int diemtichluy) {
        this.mave = mave;
        this.masuatchieu = masuatchieu;
        this.manhanvien = manhanvien;
        this.masukien = masukien;
        this.mahoivien = mahoivien;
        this.maghe = maghe;
        this.ngaylap = ngaylap;
        this.giave = giave;
        this.diemtichluy = diemtichluy;
    }

    public Ve() {
    }
    
    
}
