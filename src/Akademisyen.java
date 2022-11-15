public class Akademisyen implements Sablon<String>{


    @Override
    public void dosyaYukle(String dosya) {
        System.out.println(dosya+" Akademisyen Dosya yüklendi!");
    }

    @Override
    public String dosyaCikar() {

        System.out.println(" Akademisyen Dosya cikarıldı!");
        return "Dosya";
    }
}
