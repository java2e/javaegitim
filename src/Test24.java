public class Test24 {

    /*
    Interface!!!

    Arayüzler ;

    inteface

    1. final tanımlı variable
    2. private herhangi
    3. bos methodları barındırır
    4. method bos olmaldırı , Java 8 version default
    5. Coklu implemantasyon yapabilirsin
    6. İnterface direk nesne üretimi yapamazsınız!!!!
    7. implements keyword sınıf,abstractlara implement ederk kullanıyoruz


    public interface Sablon {

    public final long maxDosyaBoyutu=5124;

    public void dosyaYuke(String dosya);

    public String dosyaCikar();


    }

    abstract class

    1. içerisinde abstract tanımlı method => bos bir method
    2. dolu method olabilir.
    3. sınıflara extends keyword kalıtımla genısletılebılır
    4. dırek olarak nesne uretımı yapılamaz

    abstract keyword


    Kalıtım Inheritance

    super class
    sub class => en gelişmiş ozellıgı sahiptir!!!!

    class olan bir yapıyı kalıtıma ugratabılırsınız
    aynı tıpte olan yapılar kalıtım olur


    A extends B
    A-> SUBCLASS
    B-> SUPERCLASS

    AYNI PAKET ICERISINDE ISE PROTECTED VE PUBLIC KULLABILIR
    FARKLI  PUBLIC
    PRIVATE HIC BIR SEKILDE KULLANMAZ

    SUBCLASS URETILIRKEN NEW SUPER CLASS BIR TANE NESNE URETILIR.

    A a = new A() => a bir tane nesne hemnde b den bir nesne
    B b = new B() => sadece bden 1 tane nesn eüretilir

    acil.Cagri
    id long private
    adi strşng
    KayıtBilgisi class
    tarih date
    adres string
    telefon string
    Bolge class


    Kayıt Bilgis
    id long
    adi  string
    soyadi string
    tcNo string

    Bolge
    id long
    adi string
    kodu sstring
    merkez telefon string




     */

    public static void main(String[] args) {

        Akademisyen akademisyen = new Akademisyen();
        akademisyen.dosyaYukle("Akademisyen");
        akademisyen.dosyaCikar();

        Personel personel = new Personel();
        personel.dosyaCikar();
        //personel.dosyaYukle("Personel!");

        Sablon sablon1 = new Akademisyen();

        Sablon sablon2 = new Personel();

        //Sablon sablon =new Sablon(); //interface üzerinde nesne üretmezsiniz!

    }
}
