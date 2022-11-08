public class Test10 {

    public static void main(String[] args) {
        /*
        6 tane rastgele sayı tutunuz ve dizi içerisine aktarınız
        sayılar 0 ila 50 arasında olsun.

        Math.random()
        dizi olustur
        for()
         */


        int dizi [] = new int[6];

        for(int i=0;i<dizi.length;i++) {
            dizi[i] = (int)(Math.random()*50);
        }

        for(int sayi:dizi)
            System.out.println(sayi);

    }
}
