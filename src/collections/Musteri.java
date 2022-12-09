package collections;

public class Musteri {

    private int id;
    private String adi;
    private String tcNo;

    public Musteri(int id,String adi,String tcNo) {
        this.id = id;
        this.adi = adi;
        this.tcNo = tcNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }
}
