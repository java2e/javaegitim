import java.util.Scanner;

public class Test4 {


    public static void main(String[] args) {

        /*
        Kullanıcıdan 1 ila 3 arasında sayı girmesini isteyiniz
        1 olması durumunda tekrar sayı girmesini isteyiniz ve girilen sayını karesi hesaplayınız
        2 olması durumunda tekrar sayı girmesini isteyiniz ve çift mi tek mi oldugunu yazınız
        3 olması durumunda uygulamadan cıkıs yapsın.

         */


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 2 3 seçiniz :");
            int secim = scanner.nextInt();
            if(secim == 1) {
                int sayi = scanner.nextInt();
                System.out.println(Math.pow(sayi,2));
            }
            else if(secim == 2) {
                int sayi = scanner.nextInt();
                if(sayi %2 == 0)
                    System.out.println("Çift sayıdır");
                else
                    System.out.println("Tek sayıdır");
            }else if(secim == 3)
                    break;
            else
                System.out.println("Hatalı giriş!");
        }

    }
}
