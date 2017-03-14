package com.infoshare.task1;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task1 {

    private static List<String> myList
            = Arrays.asList("Ala", "Marcin", "Kuba", "Łukasz", "stefan", "", "andrzej", "imieZKropka.", "imieZ,Przecinkiem");

    public static void main(String[] args) {
        /*napisac swoje predykaty dla listy
        - filtrowanie czy same litery
        - wyswietlenie pierwszych 3 imion
        - wyswietlenie najkrotszego imienia (niepustego)
        - wyswietlenie najdluzszego imienia
        - dodanie znaków na końcu imienia
        - dodanie znaków na poczatku
        - zamiana wszystkich liter na duze litery
        - wyswietlenie imion ktore zawieraja w sobie litere 'a'

        UWAGA szablon może zawierać błędy; nie musicice trzymać się struktury szablonu, możecie dopisywać swoje metody, klasy
        lub modyfikować istniejące, liczy się wykonania zadania z wykorzystaniem konstrukcji z Java 8
        */
        System.out.println("PREDYKATY:");

        //filtrowanie czy same litery
        Predicate<String> onlyLettersPredicate = s -> !s.isEmpty() && s.chars().allMatch(Character::isLetter);
        System.out.println("\n filtrowanie czy same litery:");
        predicateAction(onlyLettersPredicate);

        //wyswietlenie pierwszych 3 imion
        System.out.println("\n wyswietlenie pierwszych 3 imion:");
        List<String> first3names = myList.stream().limit(3).collect(Collectors.toList());
        first3names.forEach(System.out::println);

        //wyswietlenie najkrotszego imienia (niepustego)
        System.out.println("\n wyswietlenie najkrotszego imienia (niepustego):");
        Optional<String> shortestName = myList.stream()
                .filter(s -> !s.isEmpty())
                .min(Comparator.comparingInt(String::length));
        System.out.println(shortestName.orElse("Nie znaleziono (jednego?) najkrótszego imienia ?"));

        //wyswietlenie najdluzszego imienia
        System.out.println("\n wyswietlenie najdluzszego imienia:");
        Optional<String> longestName = myList.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println(longestName.isPresent() ? longestName.get() : "Nie znaleziono (jednego?) najdluzszego imienia ?");

        //dodanie znaków na końcu imienia
        System.out.println("\n dodanie znaków na końcu imienia:");
        myList.stream()
                .map(s -> s+"+ABC")
                .forEach(System.out::println);

        //dodanie znaków na poczatku
        System.out.println("\n dodanie znaków na poczatku:");
        myList.stream()
                .map(s -> "ABC+"+s)
                .forEach(System.out::println);

        //zamiana wszystkich liter na duze litery
        System.out.println("\n zamiana wszystkich liter na duze litery:");
        myList.stream()
                .filter(s -> !s.isEmpty())
                .map(String::toUpperCase)
                .forEach(System.out::println);

        //wyswietlenie imion ktore zawieraja w sobie litere 'a'
        System.out.println("\n wyswietlenie imion ktore zawieraja w sobie litere 'a':");
        Predicate<String> containsLetterA = s -> s.contains("a");
        predicateAction(containsLetterA);

        /*napisac swoja funkcje Function
        - zwracajaca dlugosc imion (wynik na konsoli: imie - ilosc_liter)
        - zwracajaca pierwsze litery imienia (wynik: imie - litera)
        */

        System.out.println("\nFUNKCJE");

        //zwracajaca dlugosc imion (wynik na konsoli: imie - ilosc_liter)
        System.out.println("\n dlugosc imion:");
        Function<String,String> LengthOfName = s -> s+" - "+s.length();
        functionAction(myList,LengthOfName);

        //zwracajaca pierwsze litery imienia (wynik: imie - litera)
        System.out.println("\n pierwsze litery imienia:");
        Function<String,String> fistLetterOfName = s -> !s.isEmpty() ? s + " - " + s.substring(0,1) : "[a tutaj brak liter]";
        functionAction(myList,fistLetterOfName);
    }

    private static void predicateAction(Predicate myPredicate) {
        Collection filteredCollection = MyJava8Class.getFilteredCollecion(myList, myPredicate);
        MyJava8Class.printFilteredCollection(filteredCollection);
    }

    private static <T,R> void functionAction(List<T> myList, Function<T,R> myFunction) {
        myList.stream()
                .map(myFunction)
                .forEach(System.out::println);
    }
}
