import java.io.*;
import java.nio.charset.StandardCharsets;

public class Test27 {

    /*

    JAVA I/O

    input ve output  port okuma yazma
    txt
    port bir cihaz
    usb
    tcp
    consolda
    sout

    dosya okuma
    cihaz veri okuma

    java.io package

    pdf,word,excel .... 3.parti bir framework
    apache report



     */

    public static void main(String[] args) {


        File file = new File("C:\\Users\\Mehmet Demircioglu\\Desktop\\112_Acil\\test.txt");

        file.canExecute();
        file.canRead();
        file.canWrite();

        file.isFile();
        //file.createNewFile(); exception bekler

        try {
            FileInputStream inputStream = new FileInputStream(file);

            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

            //bufferedInputStream.


            int c = 0;

            while ((c=inputStream.read()) != -1) {
                System.out.print((char)c);
            }

            File file2=new File("C:\\Users\\Mehmet Demircioglu\\Desktop\\112_Acil\\deneme.txt");

            if(!file2.exists())
                file2.createNewFile();

            FileOutputStream outputStream = new FileOutputStream(file2);

            String kelime ="112 Acil!";

            outputStream.write(kelime.getBytes(StandardCharsets.UTF_8));




        }
        catch (IOException ex) {
            System.out.println("Problem :"+ex.getMessage());
        }


    }

}
