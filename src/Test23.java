import paket1.Islem;
import paket1.Kitap;

public class Test23 {

    /*
    Kitap adında bir class olusturunuz

    içerisinde
        adi
        yazar
        isbnNo
        sayfaSayisi

        2 tane method
            1. kitap adini yazdıran method
            2. Kitap sayfasayısını bize cevrien method yazalım


            İslem adinda bir sınıf class yazınız

            içerisine int bir dizi tanımlayınız ve dizinin boyutun nesne üretimende dısardan alınız.

            ve dizinin her bir lemanın faktorıyel heesabını yapan methodu reverse olara yazınız

     */


    public static void main(String[] args) {


        Kitap kitap = new Kitap();
        kitap.adi ="Java";
        kitap.isbnNo="12313";
        kitap.yazar="Developer";
        kitap.sayfaSayisi = 110;

        kitap.yazdir();

        int sayfaSayisi = kitap.getirSayfaSayisi(); // kitap.sayfaSayisi;

        System.out.println(sayfaSayisi);

        Islem islem = new Islem(3);

        islem.dizi[0]=10;
        islem.dizi[1]=5;
        islem.dizi[2]=7;

        for (int sayi:islem.dizi) {

            int sonuc =islem.hesapla(sayi);
            System.out.println(sonuc);
        }



    }
}
