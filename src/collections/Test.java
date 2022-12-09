package collections;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    /*
    Collections
    Listeleme ile ilgili işlemler....

    Arrays.... Diziler..


    List ->Interface
    Map ->Interface

    List<> -> ArrayList<>   index kayıt alır sıralı 0 ..... n

    Map<K,V> -> HashMap<K,V>  Key -> Value

    Tree

    Vector

    ....

     */

    public static void main(String[] args) {


        List<String> liste = new ArrayList<>(); // polimor
        //ArrayList<String> liste2=new ArrayList<>(); //instance

        liste.add("Adana");
        liste.add("Ankara");

        liste.size(); //
        liste.get(0);
        liste.isEmpty();

        for(int i=0;i<liste.size();i++) {
            System.out.println(liste.get(i));
        }

        for(String kelime : liste) {
            System.out.println(kelime);
        }


        Map<String,String> mapList = new HashMap<>();

        mapList.put("01","Adana");
        mapList.put("02","Ankara");

        // Map<String,Ogrenci> ....


        // Set -> HashSet<Value Type>

        Set<String> hashList =new HashSet<>();

        HashSet<String> liste1 = new HashSet<>();

        hashList.add("Adana");
        hashList.add("Ankara");
        // hashList.addAll()

        /*
        Stream API

         */

        List<String> list = new ArrayList<>();
        liste.add("Adana");
        liste.add("Ankara");
        liste.add("İstanbul");
        liste.add("İzmir");
        liste.add("Antalya");

        list.stream().forEach(s -> System.out.println(s));

        list = list.stream().map(s -> s+" İli").collect(Collectors.toList());

        list.stream().forEach(s -> System.out.println(s));




    }
}
