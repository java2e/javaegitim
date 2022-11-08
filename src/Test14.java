import java.util.Scanner;

public class Test14 {

    public static void main(String[] args) {

        /*
        Bir isim listesi olusturunuz.
         1. isimler a veya A harfi ile baslamalıdr
        2. Karakter sayısı min 3 max 25 karakterli olmalıdır.
        3. Eğer kelimeye bosluklu olarak gelirse boslukları ayırarark tek tek kelime kayıt ediniz.

        Java Developer

        1. dizi olusturuunuz String personeller [] boyut belli

        String temp [] = personeller;

        personeller = new String[temp.lengt+1];

        personeller <=temp

        presoneller[enson ındex] = kelime
        ;

         */


        Scanner scanner = new Scanner(System.in);

        String personeller [] = new String[1];

        while (true) {

            System.out.println("Kelime giriniz ");

            String kelime = scanner.nextLine();

            if((kelime.charAt(0) == 'a' || kelime.charAt(0) == 'A') && (kelime.length()>3 && kelime.length()<25)) {

                if(personeller[0] == "")
                {
                    personeller[0] = kelime;
                }
                else{

                    String temp [] = personeller;
                    personeller = new String[temp.length+1];
                    for(int i=0;i<temp.length;i++){
                        personeller[i] = temp[i];
                    }
                    personeller[personeller.length-1] = kelime;

                }



            }else {
                System.out.println("Not validate kelime");
            }

            /*


            asdakdaklsdjasjd
             */



        }



    }
}
