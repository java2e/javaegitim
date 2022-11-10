public class Test20 {

    /*
     Bir kelime giriniz
     girmiş kelimeyi sondan basa dogru yazdırınız.
     */

    public static String convertWord(String kelime) {

        String yeniKelime="";

        for(int i=kelime.length()-1;i>=0;i--) {

            yeniKelime = yeniKelime + kelime.charAt(i);

        }

        return yeniKelime;
    }


    public static void main(String[] args) {


        String sonuc = convertWord("Java Developer");

        System.out.println(sonuc);
    }
}
