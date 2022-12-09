package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2  {

    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();
        liste.add("Adana");
        liste.add("Ankara");
        liste.add("İstanbul");
        liste.add("İzmir");
        liste.add("Antalya");

        liste.stream().forEach(s -> System.out.println(s));

        liste = liste.stream().map(s -> s+" İli").collect(Collectors.toList());

        liste.stream().forEach(s -> System.out.println(s));

    }
}
