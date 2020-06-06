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
public class PhongChieu {

    private String maphong;
    private String tenphong;
    private int soluongghe;

    public String getMaphong() {
        return maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    public int getSoluongghe() {
        return soluongghe;
    }

    public void setSoluongghe(int soluongghe) {
        this.soluongghe = soluongghe;
    }

    public PhongChieu() {
    }

    public PhongChieu(String maphong, String tenphong, int soluongghe) {
        this.maphong = maphong;
        this.tenphong = tenphong;
        this.soluongghe = soluongghe;
    }

}
