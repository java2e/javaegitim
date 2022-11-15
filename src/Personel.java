public class Personel implements Sablon{
    @Override
    public void dosyaYukle(String dosya) {
        System.out.println("Personel dosya yuklendi!");
    }

    @Override
    public String dosyaCikar() {

        System.out.println("Personel dosya cikarildi!");
        return "Dosya";
    }
}
