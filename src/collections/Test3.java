package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {


    public static void main(String[] args) {


        ArrayList<Ogrenci> liste =new ArrayList<>(); // Ogrenci [] =>10

        liste.add(new Ogrenci("Ahmet","Taş","12312312312")); //0
        liste.add(new Ogrenci("Mehmet","Taş","44444444444")); //1
        liste.add(new Ogrenci("Veli","Taş","22222222222"));  //2
        liste.add(new Ogrenci("Ayşe","Taş","66666666666"));
        liste.add(new Ogrenci("Fatma","Taş","888888888888"));

        /*
        Lambda expressşon
        Java 8 ile birlikte gelen!
         */

        liste.stream().forEach(ogrenci -> System.out.println(ogrenci));

        liste.stream().map(ogrenci -> {
            ogrenci.setTcNo(ogrenci.getTcNo().substring(0,3)+"*********");
            return ogrenci;
        }).collect(Collectors.toList());

        liste.stream().forEach(ogrenci -> System.out.println(ogrenci));

        liste = (ArrayList<Ogrenci>) liste.stream().filter(ogrenci -> ogrenci.getTcNo().charAt(0)=='1').collect(Collectors.toList());

        liste.stream().forEach(ogrenci -> System.out.println(ogrenci));


        //liste.get(3);// index 3 olanı getiri index 0 baslar!!



    }
}
