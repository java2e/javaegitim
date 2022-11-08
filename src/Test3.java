import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        /*
        Bir sayı giriniz ve bu sayının asal sayı olup olmadıgını ekrana yazdırınız
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");

        int sayi = scanner.nextInt();
        boolean isAsalMi = true;

        for(int i=2;i<sayi;i++) {

            if(sayi%i == 0) {
                isAsalMi =false;
            }

        }

        if(isAsalMi) {
            System.out.println("Asal sayıdır");
        }
        else {
            System.out.println("Asal sayı değildir!");
        }




    }
}
