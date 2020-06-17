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
public class Phim {

    private String maphim;
    private String tenphim;
    private int thoiluong;
    private String theloai;
    private String nhasanxuat;
    private int namsanxuat;
    private String dienvien;
    private String nuocsanxuat;
    private Date ngaykhoichieu;
    private int gioihantuoi;
    private String tomtat;
    private String trangthai;

    public String getMaphim() {
        return maphim;
    }

    public void setMaphim(String maphim) {
        this.maphim = maphim;
    }

    public String getTenphim() {
        return tenphim;
    }

    public void setTenphim(String tenphim) {
        this.tenphim = tenphim;
    }

    public int getThoiluong() {
        return thoiluong;
    }

    public void setThoiluong(int thoiluong) {
        this.thoiluong = thoiluong;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getNhasanxuat() {
        return nhasanxuat;
    }

    public void setNhasanxuat(String nhasanxuat) {
        this.nhasanxuat = nhasanxuat;
    }

    public int getNamsanxuat() {
        return namsanxuat;
    }

    public void setNamsanxuat(int namsanxuat) {
        this.namsanxuat = namsanxuat;
    }

    public String getDienvien() {
        return dienvien;
    }

    public void setDienvien(String dienvien) {
        this.dienvien = dienvien;
    }

    public String getNuocsanxuat() {
        return nuocsanxuat;
    }

    public void setNuocsanxuat(String nuocsanxuat) {
        this.nuocsanxuat = nuocsanxuat;
    }

    public Date getNgaykhoichieu() {
        return ngaykhoichieu;
    }

    public void setNgaykhoichieu(Date ngaykhoichieu) {
        this.ngaykhoichieu = ngaykhoichieu;
    }

    public int getGioihantuoi() {
        return gioihantuoi;
    }

    public void setGioihantuoi(int gioihantuoi) {
        this.gioihantuoi = gioihantuoi;
    }

    public String getTomtat() {
        return tomtat;
    }

    public void setTomtat(String tomtat) {
        this.tomtat = tomtat;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public Phim() {
    }

    public Phim(String maphim, String tenphim, int thoiluong, String theloai, String nhasanxuat, int namsanxuat, String dienvien, String nuocsanxuat, Date ngaykhoichieu, int gioihantuoi, String tomtat, String trangthai) {
        this.maphim = maphim;
        this.tenphim = tenphim;
        this.thoiluong = thoiluong;
        this.theloai = theloai;
        this.nhasanxuat = nhasanxuat;
        this.namsanxuat = namsanxuat;
        this.dienvien = dienvien;
        this.nuocsanxuat = nuocsanxuat;
        this.ngaykhoichieu = ngaykhoichieu;
        this.gioihantuoi = gioihantuoi;
        this.tomtat = tomtat;
        this.trangthai = trangthai;
    }
    
     public Phim(String maphim, String tenphim) {
        this.maphim = maphim;
        this.tenphim = tenphim;
    }

}
