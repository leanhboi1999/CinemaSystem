package entity;

public class Ghe {
    private String maghe;
    private String maphong;
    private String soghe;

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

    public String getSoghe() {
        return soghe;
    }

    public void setSoghe(String soghe) {
        this.soghe = soghe;
    }

    public Ghe() {
    }

    public Ghe(String maghe) {
        this.maghe = maghe;
    }
    
    public Ghe(String maghe, String maphong, String soghe) {
        this.maghe = maghe;
        this.maphong = maphong;
        this.soghe = soghe;
    }
    
    
}
