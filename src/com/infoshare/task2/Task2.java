package com.infoshare.task2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Task2 {

    private static List<Integer> myList
            = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);

    public static void main(String[] args) {
        /*
        - napisac metode filtrujaca
            a) filtrujaca podana liczbe
            b) filtrujaca podana cyfre - podanie '1' filtruje '1', '10', '11' itd
        - wypisac wynik
        - stworzyc mape <Integer, Integer>, ktorej kluczem sa liczby z myList, a wartoscia ich potega 2 stopnia
        - wypisac wynik w formacie: klucz - wartosc
        */

        System.out.println("\n metoda filtrujaca:");
        int number = 3; //dowolna liczba do filtrowania
        List<Integer> filteredNumbers = CollectionOperations.filterMyList(number, myList);
        CollectionOperations.printListResult(filteredNumbers);

        System.out.println("\n mapa potęg:");
        Map<Integer, Integer> powerMap = CollectionOperations.buildMyMap(myList);
        CollectionOperations.printMapResult(powerMap);
    }
}
