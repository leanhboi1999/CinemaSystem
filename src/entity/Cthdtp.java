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
public class Cthdtp {
    private String mahoadon;
    private String mathucpham;
    private int soluong;

    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    public String getMathucpham() {
        return mathucpham;
    }

    public void setMathucpham(String mathucpham) {
        this.mathucpham = mathucpham;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public Cthdtp() {
    }

    public Cthdtp(String mahoadon, String mathucpham, int soluong) {
        this.mahoadon = mahoadon;
        this.mathucpham = mathucpham;
        this.soluong = soluong;
    }
    
    
}
