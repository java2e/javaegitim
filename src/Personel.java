public class Personel implements Sablon<Long>{
    @Override
    public void dosyaYukle(Long dosya) {
        System.out.println("Personel dosya yuklendi!");
    }

    @Override
    public Long dosyaCikar() {

        System.out.println("Personel dosya cikarildi!");
        return 123l;
    }
}
