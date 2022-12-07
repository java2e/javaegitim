public class Test26 {

    public static void main(String[] args) {


        String kelime = null;

        try {
            if (kelime.charAt(0) == 'a') {
                throw new MyException("Küçük harfle baslayamazé!");
            }
        }
        catch (MyException ex) {
            System.out.println(ex.getMessage());
        }



    }
}
