import java.util.Scanner;

public class Test13 {

    public static void main(String[] args) {

        /*
        Kullanıcıdan 2 kelime alınız ve karakter sayısı 10 dan kucuk ise validate


         ()değilse not validated
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci Kelimeyi Giriniz :");

        String kelime1 = scanner.nextLine();

        System.out.println("İkinci Kelimeyi Giriniz :");

        String kelime2 = scanner.nextLine();

        if(kelime1.length()>10)
            System.out.println("Not Validated!");
        else
            System.out.println("Validated'");

        if(kelime2.length()>10)
            System.out.println("Not Validated!");
        else
            System.out.println("Validated!");


    }
}
