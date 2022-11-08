public class Test6 {

    public static void main(String[] args) {

        /*

            * i=1 toplam = 2  toplamsatir - kacinci ssait
          * * * i=2 toplam 1
        * * * * * i=3 toplam 0


         */
      int satir=30;
      for(int i=1;i<satir+1;i++) { // -> satır sayısını

          for(int j=satir-i;j>0;j--) // bosluk takip edecek
          {
              System.out.print(" ");
          }

         for(int k=0;k<2*i-1;k++) // yıldızları takip edecektir.
         {
             System.out.print("*");
         }

          System.out.println("");
      }






    }
}
