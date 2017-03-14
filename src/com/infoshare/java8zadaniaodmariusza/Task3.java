package com.infoshare.java8zadaniaodmariusza;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created by bartman3000 on 2017-03-14.
 */
public class Task3 {

    private static List<String> myList
            = Arrays.asList("Ala", "Marcin", "Kuba", "Łukasz", "stefan", "", "andrzej", "imieZKropka.", "imieZ,Przecinkiem");

    public static void main(String[] args) {

        Function<String,String> infoBytes = s -> s+ "-" + Arrays.toString(s.getBytes());

        myList.stream()
                .map(infoBytes)
                .forEach(System.out::println);
    }

}
