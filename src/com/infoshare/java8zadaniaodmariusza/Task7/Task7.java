package com.infoshare.java8zadaniaodmariusza.Task7;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

/**
 * Created by bartman3000 on 2017-03-14.
 */
public class Task7 {

    public static void main(String[] args) {

        List<Ksiazka> ksiazki = utworz();

        //a. podziel książki wg gatunku
        System.out.println("\n podziel książki wg gatunku:");
        Map<Gatunek, List<Ksiazka>> gatunki = ksiazki.stream()
                .collect(groupingBy(Ksiazka::getGatunek));
        System.out.println(gatunki);

        //b. znajdź najdłuższą w każdym gatunku
        System.out.println("\n znajdź najdłuższą w każdym gatunku:");
        Map<Gatunek, Optional<Ksiazka>> najdluszaWgatunku = ksiazki.stream()
                .collect(groupingBy(Ksiazka::getGatunek,
                        maxBy(Comparator.comparingInt(Ksiazka::getLiczbaStron))));
        System.out.println(najdluszaWgatunku);

        //c. znajdź te, których nazwisko autora zaczyna się na literę A
        System.out.println("\n te, których nazwisko autora zaczyna się na literę A:");
        ksiazki.stream()
                .filter(x -> x.getAutor().startsWith("A"))
                .forEach(System.out::println);

        //d. znajdż 3 najdłuższe
        System.out.println("\n znajdż 3 najdłuższe:");
        ksiazki.stream()
                .sorted(Comparator.comparingInt(Ksiazka::getLiczbaStron).reversed())
                .limit(3)
                .forEach(System.out::println);

        //e. znajdż 3 najkrótsze
        System.out.println("\n znajdż 3 najkrótsze:");
        ksiazki.stream()
                .sorted(Comparator.comparingInt(Ksiazka::getLiczbaStron))
                .limit(3)
                .forEach(System.out::println);

        //f. Znajdź tę o nadłuższym tytule
        System.out.println("\n Znajdź tę o nadłuższym tytule:");
        Optional<Ksiazka> najdluzszyTytul = ksiazki.stream()
                .max(Comparator.comparingInt(s -> s.getTytul().length()));
        System.out.println(najdluzszyTytul.get().getTytul());

        //g. Wypisz tytuły książęk posortowane wg rosnącej liczy stron
        System.out.println("\n Wypisz tytuły książęk posortowane wg rosnącej liczy stron:");
        ksiazki.stream()
                .sorted(Comparator.comparingInt(Ksiazka::getLiczbaStron))
                .map(Ksiazka::getTytul)
                .forEach(System.out::println);

        //h. znajdź tylko te dla dzieci
        System.out.println("\n znajdź tylko te dla dzieci:");
        ksiazki.stream()
                .filter(Ksiazka::isDlaDzieci)
                .forEach(System.out::println);

    }

    private static List<Ksiazka> utworz() {
        List<Ksiazka> myList = new ArrayList<>();
        myList.add(new Ksiazka("Konopnicka", "Nasza Szkapa", Gatunek.MELODRAMAT, 100, true));
        myList.add(new Ksiazka("Forsyth", "Ręka Boga", Gatunek.SENSACJA, 300, false));
        myList.add(new Ksiazka("Lem", "Pirx", Gatunek.SENSACJA, 200, true));
        myList.add(new Ksiazka("Tony Halik", "Afryka", Gatunek.DOKUMENT, 150, true));
        myList.add(new Ksiazka("Coelho", "Coś tam z Coelho", Gatunek.MELODRAMAT, 400, false));
        myList.add(new Ksiazka("A jakiś na litere A", "ksiazka tego na A", Gatunek.MELODRAMAT, 40, false));
        return myList;
    }

}
