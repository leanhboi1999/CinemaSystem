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
public class HinhThuc {
    private String mahinhthuc;
    private String tenhinhthuc;

    public String getMahinhthuc() {
        return mahinhthuc;
    }

    public void setMahinhthuc(String mahinhthuc) {
        this.mahinhthuc = mahinhthuc;
    }

    public String getTenhinhthuc() {
        return tenhinhthuc;
    }

    public void setTenhinhthuc(String tenhinhthuc) {
        this.tenhinhthuc = tenhinhthuc;
    }

    public HinhThuc() {
    }

    public HinhThuc(String mahinhthuc, String tenhinhthuc) {
        this.mahinhthuc = mahinhthuc;
        this.tenhinhthuc = tenhinhthuc;
    }
    
    
}
