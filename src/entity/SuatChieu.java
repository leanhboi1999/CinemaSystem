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
public class SuatChieu {

    private String masuatchieu;
    private String maphong;
    private String masuatphim;
    private Date thoigianchieu;
    private int trangthai;

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

    public Date getThoigianchieu() {
        return thoigianchieu;
    }

    public void setThoigianchieu(Date thoigianchieu) {
        this.thoigianchieu = thoigianchieu;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public SuatChieu() {
    }

    public SuatChieu(String masuatchieu, String maphong, String masuatphim, Date thoigianchieu, int trangthai) {
        this.masuatchieu = masuatchieu;
        this.maphong = maphong;
        this.masuatphim = masuatphim;
        this.thoigianchieu = thoigianchieu;
        this.trangthai = trangthai;
    }

}
