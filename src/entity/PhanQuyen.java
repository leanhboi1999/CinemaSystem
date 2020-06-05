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
public class PhanQuyen {

    private String maquyen;
    private String tenquyen;

    public String getMaquyen() {
        return maquyen;
    }

    public void setMaquyen(String maquyen) {
        this.maquyen = maquyen;
    }

    public String getTenquyen() {
        return tenquyen;
    }

    public void setTenquyen(String tenquyen) {
        this.tenquyen = tenquyen;
    }

    public PhanQuyen() {
    }

    public PhanQuyen(String maquyen, String tenquyen) {
        this.maquyen = maquyen;
        this.tenquyen = tenquyen;
    }

}
