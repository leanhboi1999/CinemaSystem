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
public class TaiKhoan {

    private String tendangnhap;
    private String manhanvien;
    private String matkhau;
    private String maquyen;

    public TaiKhoan() {
    }

    public TaiKhoan(String tendangnhap, String manhanvien, String matkhau, String maquyen) {
        this.tendangnhap = tendangnhap;
        this.manhanvien = manhanvien;
        this.matkhau = matkhau;
        this.maquyen = maquyen;
    }

    

    public String getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getMaquyen() {
        return maquyen;
    }

    public void setMaquyen(String maquyen) {
        this.maquyen = maquyen;
    }

}
