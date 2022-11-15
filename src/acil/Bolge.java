package acil;

public class Bolge extends BaseModel {

    public Bolge() {
        System.out.println("Bolge nesne üretildi!");
    }


    @Override
    public String getAdi() {

        System.out.println("Bolge içerisinde cagrıldı");
        return "test";
    }

    private String kodu;
    private String telefon;


    public String getKodu() {
        return kodu;
    }

    public void setKodu(String kodu) {
        this.kodu = kodu;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
