package com.infoshare.java8zadaniaodmariusza;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by bartman3000 on 2017-03-14.
 */
public class Task4 {

    private static List<Integer> myList = Arrays.asList(2, 4, 10, 6, 1, 5);

    public static void main(String[] args) {

        Function<List<Integer>,List<Integer>> doubleEveryElement = new Function<List<Integer>, List<Integer>>() {
            @Override
            public List<Integer> apply(List<Integer> list) {
                return list.stream()
                        .map(i -> i * 2)
                        .collect(Collectors.toList());
            }
        };

        List<Integer> doubleValues = doubleEveryElement.apply(myList);
        System.out.println(doubleValues);
    }

}
