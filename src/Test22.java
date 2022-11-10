import paket1.Personel;

import java.util.Scanner;

public class Test22 {

    /*

    Class Sınıf yapı!

    1. constructor method => donus tipi yoktur içerisine alabilir.
    2. attributes
    3.method

    tanım class private public protected

    kalıtım

    poliformizm

    -buyuk harfle baslaması gerekir!

    public class className {


    }

    Ogrenci



     */

    public static void main(String[] args) {

        Personel personel = new Personel();

        personel.adi = "Java";
        personel.soyadi="Developer";
        personel.tcNo="1123132";



        System.out.println(personel.adi+" "+personel.soyadi);
    }
}
