public class Test11 {

    public static void main(String[] args) {

        /*
        toplam 5 tane 1 ila 60 arasında sayı tutunuz fakat sayılar birbirinden farklı olmalıdır.

        int dizi
        dongu 5 tane while
         */

        int sayilar [] = new int[5];

        sayilar[0] = (int)(Math.random()*60) +1;

        int i = 1;

        while (i<sayilar.length) {

            int sayi = (int)(Math.random()*60) +1;
            boolean varMi = false;
            for(int j=0;j<i;j++) {
                if(sayi == sayilar[j])
                {
                    varMi = true;
                }
            }

            if(!varMi)
            {
                sayilar[i] = sayi;
                i++;
            }

        }



    }
}
