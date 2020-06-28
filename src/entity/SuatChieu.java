package entity;

import java.sql.Timestamp;
import java.util.Date;

public class SuatChieu {

    private String masuatchieu;
    private String maphong;
    private String masuatphim;
    private Timestamp thoigianchieu;
    private String trangthai;
    private String tenphong;
    private String ngonngu;
    private String dinhdang;
    private String hinhthuc;
    private String tenphim;

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    public String getNgonngu() {
        return ngonngu;
    }

    public void setNgonngu(String ngonngu) {
        this.ngonngu = ngonngu;
    }

    public String getDinhdang() {
        return dinhdang;
    }

    public void setDinhdang(String dinhdang) {
        this.dinhdang = dinhdang;
    }

    public String getHinhthuc() {
        return hinhthuc;
    }

    public void setHinhthuc(String hinhthuc) {
        this.hinhthuc = hinhthuc;
    }

    public String getTenphim() {
        return tenphim;
    }

    public void setTenphim(String tenphim) {
        this.tenphim = tenphim;
    }

    public String getMasuatchieu() {
        return masuatchieu;
    }

    public void setMasuatchieu(String masuatchieu) {
        this.masuatchieu = masuatchieu;
    }

    public String getMaphong() {
        return maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public String getMasuatphim() {
        return masuatphim;
    }

    public void setMasuatphim(String masuatphim) {
        this.masuatphim = masuatphim;
    }

    public Timestamp getThoigianchieu() {
        return thoigianchieu;
    }

    public void setThoigianchieu(Timestamp thoigianchieu) {
        this.thoigianchieu = thoigianchieu;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public SuatChieu() {
    }

    public SuatChieu(String masuatchieu, String masuatphim, Timestamp thoigianchieu, String tenphong) {
        this.masuatchieu = masuatchieu;
        this.masuatphim = masuatphim;
        this.thoigianchieu = thoigianchieu;
        this.tenphong = tenphong;
    }

    public SuatChieu(String masuatchieu, String maphong, String masuatphim, Timestamp thoigianchieu, String trangthai) {
        this.masuatchieu = masuatchieu;
        this.maphong = maphong;
        this.masuatphim = masuatphim;
        this.thoigianchieu = thoigianchieu;
        this.trangthai = trangthai;
    }

    public SuatChieu(String masuatchieu, String maphong, Timestamp thoigianchieu, String trangthai, String ngonngu, String dinhdang, String hinhthuc) {
        this.masuatchieu = masuatchieu;
        this.maphong = maphong;
        this.thoigianchieu = thoigianchieu;
        this.trangthai = trangthai;
        this.dinhdang = dinhdang;
        this.ngonngu = ngonngu;
        this.hinhthuc = hinhthuc;

    }
}
