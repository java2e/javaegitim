package collections;

public class Urun {

    private int id;

    private String adi;

    private long fiyati;

    private int miktar;

    public Urun(int id,String adi,long fiyati,int miktar) {
        this.id = id;
        this.adi = adi;
        this.fiyati = fiyati;
        this.miktar = miktar;
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

    public long getFiyati() {
        return fiyati;
    }

    public void setFiyati(long fiyati) {
        this.fiyati = fiyati;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }
}
