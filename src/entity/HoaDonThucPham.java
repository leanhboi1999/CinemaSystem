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
public class HoaDonThucPham {

    private String mahoadon;
    private String manhanvien;
    private int sotien;
    private String ngaylap;

    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    public int getSotien() {
        return sotien;
    }

    public void setSotien(int sotien) {
        this.sotien = sotien;
    }

    public String getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(String ngaylap) {
        this.ngaylap = ngaylap;
    }

    public HoaDonThucPham() {
    }

    public HoaDonThucPham(String mahoadon, String manhanvien, int sotien, String ngaylap) {
        this.mahoadon = mahoadon;
        this.manhanvien = manhanvien;
        this.sotien = sotien;
        this.ngaylap = ngaylap;
    }

}
