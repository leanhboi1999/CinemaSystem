package entity;

import java.util.Date;

public class NhanVien {
    private String manhanvien;
    private String machucvu;
    private String hoten;
    private String email;
    private String gioitinh;
    private Date ngaysinh;
    private String diachi;
    private String dienthoai;
    private Date ngayvaolam;
    private int trangthai;
    private String cmnd;

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
    
    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getMachucvu() {
        return machucvu;
    }

    public void setMachucvu(String machucvu) {
        this.machucvu = machucvu;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public Date getNgayvaolam() {
        return ngayvaolam;
    }

    public void setNgayvaolam(Date ngayvaolam) {
        this.ngayvaolam = ngayvaolam;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public NhanVien() {
    }

    public NhanVien(String manhanvien, String machucvu, String hoten, String email, String cmnd, String gioitinh, Date ngaysinh, String diachi, String dienthoai, Date ngayvaolam, int trangthai) {
        this.manhanvien = manhanvien;
        this.machucvu = machucvu;
        this.hoten = hoten;
        this.email = email;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.dienthoai = dienthoai;
        this.ngayvaolam = ngayvaolam;
        this.trangthai = trangthai;
        this.cmnd = cmnd;
    }

    
}
