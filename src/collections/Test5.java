package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test5 {

    public static void main(String[] args) {

        Map<String,List<Urun>> urunMusteriListesi = new HashMap<>();


        // Ahmeti Sepeti
        List<Urun> urunList1 = new ArrayList<>();

        urunList1.add(new Urun(1,"Elma",2,100));
        urunList1.add(new Urun(2,"Armut",2,100));
        urunList1.add(new Urun(3,"Krpuz",2,100));


        // Mehmetin Sepeti
        List<Urun> urunList2 = new ArrayList<>();

        urunList2.add(new Urun(1,"Elma",2,100));
        urunList2.add(new Urun(2,"Armut",2,100));
        urunList2.add(new Urun(3,"Krpuz",2,100));

        Musteri musteri1 = new Musteri(1,"Ahmet","123123123");


        urunMusteriListesi.put(musteri1.getTcNo(),urunList1);
        urunMusteriListesi.put("12222222",urunList2);



    }
}
