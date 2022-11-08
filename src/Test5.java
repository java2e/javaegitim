public class Test5 {

    public static void main(String[] args) {
        /*

        * i=0
            * i=1
                * i=2
                    * i=3
                        * i=4


         */


        for(int i=0;i<5;i++) {

            for(int j=0;j<i;j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
