package com.infoshare.java8zadaniaodmariusza;

import java.util.Arrays;
import java.util.List;

/**
 * Created by bartman3000 on 2017-03-14.
 */
public class Task2 {

    private static List<String> myList
            = Arrays.asList("Ala", "Marcin", "Kuba", "Łukasz", "stefan", "", "andrzej", "imieZKropka.", "imieZ,Przecinkiem");

    public static void main(String[] args) {

        myList.stream()
                .filter(s -> s.endsWith("a"))
                .forEach(System.out::println);

    }

}
