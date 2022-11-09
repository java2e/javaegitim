import java.util.Scanner;

public class Test16 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir kelime giriniz :");

        String kelime = scanner.nextLine();

        String yeniKelime="";

        for(int i=kelime.length()-1;i>=0;i--) {
            System.out.print(kelime.charAt(i));
            yeniKelime=yeniKelime +kelime.charAt(i);
        }

        if(kelime.equals(yeniKelime))
        {
            System.out.println("Poligram bir kelimedir!");
        }
        else {
            System.out.println("Poligram bir kelime değildir!");
        }

        for(int i=0;i<kelime.length();i++) {

            char c = kelime.charAt(i);

            int c1 = (int)c;
            c1 = c1+2;

            System.out.print((char)c1);

        }



    }


}
