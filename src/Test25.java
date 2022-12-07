public class Test25 {

    /*

    Exceptionlar // Hata Yakalama

    ....
    ...
    ..
    ....

    try catch

    Exception => throw


    try {

    // asıl kodunuz var!!!


    }
    catch(exception tipi) {

    }





     */


    public static void main(String[] args) {

        int sonuc = 0;
        int bolen=0;

        try {
            int sayi = 10;

            if(bolen ==0)
                throw new Exception("Burada hata aldı!");

            sonuc = sayi / bolen;

        }
        catch (Exception ex )
        {
            System.out.println(ex.getMessage());
        }


        System.out.println(" Sonuc : "+sonuc);

        System.out.println("İşlem Bitti!");





    }
}
