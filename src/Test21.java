public class Test21 {

    /*
    Recursive Yenilemeli methodlar

     */

    public static boolean func(int sayi) {

        System.out.println(sayi);
        if(sayi<5)
            return false;
        sayi--; // -- -1 ++ 1 artır =+ =-
        func(sayi);

        return true;
    }


    public static int fakt(int sayi)
    {

        if(sayi<1)
            return 1;

        return sayi*fakt(sayi-1);
    }


    public static String reverse(String kelime,int length) {

        if(length<0)
            return "";
        String k = ""+kelime.charAt(length);
        return kelime.charAt(length)+reverse(kelime,length-1);


    }


    public static void main(String[] args) {

        int sonuc = fakt(5);
        String kelime = "Java";
        String yeniKelime = reverse(kelime,kelime.length()-1);

        System.out.println(yeniKelime);

    }
}
