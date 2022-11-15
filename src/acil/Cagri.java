package acil;

import java.util.Date;

public class Cagri extends BaseModel {

    private KayitBilgisi kayitBilgisi;

    private Date kayitTarihi;

    private String adres;

    private String telefon;

    private Bolge bolge;


    public KayitBilgisi getKayitBilgisi() {
        return kayitBilgisi;
    }

    public void setKayitBilgisi(KayitBilgisi kayitBilgisi) {
        this.kayitBilgisi = kayitBilgisi;
    }

    public Date getKayitTarihi() {
        return kayitTarihi;
    }

    public void setKayitTarihi(Date kayitTarihi) {
        this.kayitTarihi = kayitTarihi;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Bolge getBolge() {
        return bolge;
    }

    public void setBolge(Bolge bolge) {
        this.bolge = bolge;
    }
}
