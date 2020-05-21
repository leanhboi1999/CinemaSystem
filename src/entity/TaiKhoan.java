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

    private String tenTaiKhoan;
    private String matKhau;
    private String maNhanVien;
    private int trangThai;

    public TaiKhoan(String tenTaiKhoan, String maKhau, String maNhanVien, int trangThai) {
        setTenTaiKhoan(tenTaiKhoan);
        setMatKhau(matKhau);
        setMaNhanVien(maNhanVien);
        setTrangThai(trangThai);
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

}
