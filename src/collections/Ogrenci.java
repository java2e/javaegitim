package collections;

public class Ogrenci {

    public Ogrenci(String adi,String soyadi,String tcNo) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.tcNo = tcNo;
    }

    private String adi;
    private String soyadi;
    private String tcNo;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", tcNo='" + tcNo + '\'' +
                '}';
    }
}
