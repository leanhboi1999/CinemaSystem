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
public class NgonNgu {
    private String mangonngu;
    private String tenngonngu;

    public String getMangonngu() {
        return mangonngu;
    }

    public void setMangonngu(String mangonngu) {
        this.mangonngu = mangonngu;
    }

    public String getTenngonngu() {
        return tenngonngu;
    }

    public void setTenngonngu(String tenngonngu) {
        this.tenngonngu = tenngonngu;
    }

    public NgonNgu() {
    }

    public NgonNgu(String mangonngu, String tenngonngu) {
        this.mangonngu = mangonngu;
        this.tenngonngu = tenngonngu;
    }
    
    
}
