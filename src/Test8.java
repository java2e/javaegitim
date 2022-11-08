public class Test8 {

    public static void main(String[] args) {
        /*


         *
       * * *
     * * * * *
       * * *
         *




         */

        int satir = 5;

        int t = (satir+1)/2;

        for(int i=1;i<6;i++) {
            if(i<4) {
                for (int j = 0; j < 3 - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else {

                for (int j = 0; j < i-t; j++) {
                    System.out.print(" ");
                }
                for (int k = i; k <2*t; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }






        }


    }
}
