package entity;

public class Ghe {
    private String maghe;
    private String maphong;
    private int soghe;

    public String getMaghe() {
        return maghe;
    }

    public void setMaghe(String maghe) {
        this.maghe = maghe;
    }

    public String getMaphong() {
        return maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public int getSoghe() {
        return soghe;
    }

    public void setSoghe(int soghe) {
        this.soghe = soghe;
    }

    public Ghe() {
    }

    public Ghe(String maghe) {
        this.maghe = maghe;
    }
    
    public Ghe(String maghe, String maphong, int soghe) {
        this.maghe = maghe;
        this.maphong = maphong;
        this.soghe = soghe;
    }
    
    
}
