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
public class HoiVien {
    private String mahoivien;
    private String hoten;
    private String gioitinh;
    private String cmnd;
    private Date ngaysinh;
    private String email;
    private String sodienthoai;
    private Date ngaydangki;
    private int diemtichluy;

    public String getMahoivien() {
        return mahoivien;
    }

    public void setMahoivien(String mahoivien) {
        this.mahoivien = mahoivien;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public Date getNgaydangki() {
        return ngaydangki;
    }

    public void setNgaydangki(Date ngaydangki) {
        this.ngaydangki = ngaydangki;
    }

    public int getDiemtichluy() {
        return diemtichluy;
    }

    public void setDiemtichluy(int diemtichluy) {
        this.diemtichluy = diemtichluy;
    }

    public HoiVien() {
    }

    public HoiVien(String mahoivien, String hoten, String gioitinh, String cmnd, Date ngaysinh, String email, String sodienthoai, Date ngaydangki, int diemtichluy) {
        this.mahoivien = mahoivien;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.cmnd = cmnd;
        this.ngaysinh = ngaysinh;
        this.email = email;
        this.sodienthoai = sodienthoai;
        this.ngaydangki = ngaydangki;
        this.diemtichluy = diemtichluy;
    }
    
    
}
