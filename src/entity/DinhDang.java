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
public class DinhDang {

    private String madinhdang;
    private String tendinhdang;

    public String getMadinhdang() {
        return madinhdang;
    }

    public void setMadinhdang(String madinhdang) {
        this.madinhdang = madinhdang;
    }

    public String getTendinhdang() {
        return tendinhdang;
    }

    public void setTendinhdang(String tendinhdang) {
        this.tendinhdang = tendinhdang;
    }

    public DinhDang() {
    }

    public DinhDang(String madinhdang, String tendinhdang) {
        this.madinhdang = madinhdang;
        this.tendinhdang = tendinhdang;
    }
}
