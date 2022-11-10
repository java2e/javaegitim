package paket1;

public class Kitap {

    public Kitap() {
        System.out.println("Contructor calsıtırıldı!");
    }

    public String adi;
    public String isbnNo;
    public String yazar;
    public int sayfaSayisi;

    public void yazdir() {
        System.out.println(adi);
    }

    public int getirSayfaSayisi() {
        return sayfaSayisi;
    }
}
