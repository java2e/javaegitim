public class Test7 {

    public static void main(String[] args) {

        /*


        * * * * *
        *       *
        *   *   *
        *       *
        * * * * *





         */

        int satir= 21;
        int i=0;
        while (i<satir) {
            int j=0;
            while (j<satir) {
                if(i==0 || i==satir-1){
                    System.out.print(" *");
                }
                else if(j==0 || j==satir-1) {
                    System.out.print(" *");
                }
                else if(i==satir/2 && i==j) {
                    System.out.print(" *");
                }
                else {
                    System.out.print("  ");
                }

                j++;
            }
            System.out.println();
            i++;

        }


    }
}
