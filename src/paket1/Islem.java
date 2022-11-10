package paket1;

public class Islem {

    public int dizi[];

    public Islem(int boyut) {
        dizi = new int[boyut];
    }

    public int hesapla(int sayi) {

        if(sayi<1)
            return 1;

        return sayi*hesapla(sayi-1);
    }

}