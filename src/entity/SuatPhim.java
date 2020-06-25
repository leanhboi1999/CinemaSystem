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
public class SuatPhim {

    private String masuatphim;
    private String mangonngu;
    private String madinhdang;
    private String maphim;
    private String mahinhthuc;
    private String tenngonngu;
    private String tendinhdang;
    private String tenhinhthuc;

    public String getTenngonngu() {
        return tenngonngu;
    }

    public void setTenngonngu(String tenngonngu) {
        this.tenngonngu = tenngonngu;
    }

    public String getTendinhdang() {
        return tendinhdang;
    }

    public void setTendinhdang(String tendinhdang) {
        this.tendinhdang = tendinhdang;
    }

    public String getTenhinhthuc() {
        return tenhinhthuc;
    }

    public void setTenhinhthuc(String tenhinhthuc) {
        this.tenhinhthuc = tenhinhthuc;
    }

    public String getMasuatphim() {
        return masuatphim;
    }

    public void setMasuatphim(String masuatphim) {
        this.masuatphim = masuatphim;
    }

    public String getMangonngu() {
        return mangonngu;
    }

    public void setMangonngu(String mangonngu) {
        this.mangonngu = mangonngu;
    }

    public String getMadinhdang() {
        return madinhdang;
    }

    public void setMadinhdang(String madinhdang) {
        this.madinhdang = madinhdang;
    }

    public String getMaphim() {
        return maphim;
    }

    public void setMaphim(String maphim) {
        this.maphim = maphim;
    }

    public String getMahinhthuc() {
        return mahinhthuc;
    }

    public void setMahinhthuc(String mahinhthuc) {
        this.mahinhthuc = mahinhthuc;
    }

    public SuatPhim() {
    }

    /*public SuatPhim(String masuatphim, String mangonngu, String madinhdang, String maphim, String mahinhthuc) {
        this.masuatphim = masuatphim;
        this.mangonngu = mangonngu;
        this.madinhdang = madinhdang;
        this.maphim = maphim;
        this.mahinhthuc = mahinhthuc;
    }*/
    
    public SuatPhim(String masuatphim, String tenngonngu, String tendinhdang, String tenhinhthuc) {
        this.masuatphim = masuatphim;
        this.tenngonngu = tenngonngu;
        this.tendinhdang = tendinhdang;
        this.tenhinhthuc = tenhinhthuc;
    }

    public SuatPhim(String masuatphim, String tenngonngu, String tendinhdang, String maphim, String tenhinhthuc) {
        this.masuatphim = masuatphim;
        this.tenngonngu = tenngonngu;
        this.tendinhdang = tendinhdang;
        this.maphim = maphim;
        this.tenhinhthuc = tenhinhthuc;
    }
    
    

}
