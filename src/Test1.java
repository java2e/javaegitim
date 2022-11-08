import java.util.Scanner;

public class Test1 {


    public static void main(String[] args) {

        /*

        Bir sayı giriniz girmiş oldugumuz sayı 0 ila 100 arasındaki
        rastegele tutulan sayının altında üstünde mi?

        Math.random() => 0.00 ila 0.99 arasında double  *100
        +50

        Scanner scanner = new Scanner(System.in);

        int sayi = scanner.nextInt();

        oldugunu ekrana yazdırınız?

        */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");

        int sayi = scanner.nextInt(); //0,7

        // Math.random(); => 0.0 0.99999999999

        int rastgeleSayi =(int)(Math.random()*100); // casting

        System.out.println(rastgeleSayi);

        if(sayi>rastgeleSayi) {
            System.out.println("Sayı yukarda kaldı!");
        }
        else if(sayi<rastgeleSayi) {
            System.out.println("Sayı asağıda kaldı!");
        }
        else {
            System.out.println("Eşittir!");
        }



    }


}
