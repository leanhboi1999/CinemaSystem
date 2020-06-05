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
public class ChucVu {
    private String machucvu;
    private String tenchucvu;
    private int luongcoban;

    public String getMachucvu() {
        return machucvu;
    }

    public void setMachucvu(String machucvu) {
        this.machucvu = machucvu;
    }

    public String getTenchucvu() {
        return tenchucvu;
    }

    public void setTenchucvu(String tenchucvu) {
        this.tenchucvu = tenchucvu;
    }

    public int getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(int luongcoban) {
        this.luongcoban = luongcoban;
    }

    public ChucVu(String machucvu, String tenchucvu, int luongcoban) {
        this.machucvu = machucvu;
        this.tenchucvu = tenchucvu;
        this.luongcoban = luongcoban;
    }

    public ChucVu() {
    }
}
