package com.infoshare.task2;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionOperations {

    public static List<Integer> filterMyList(int i, List<Integer> myList) {
        if(i>9) //filtruj liczbe
        {
            return myList.stream()
                    .filter(e -> e.equals(i))
                    .collect(Collectors.toList());

        }
        else //filtruj cyfre
        {
            String digitString = Integer.toString(i);
            return myList.stream()
                    .filter(e -> e.toString().contains(digitString))
                    .collect(Collectors.toList());
        }
    }

    public static void printListResult(List<Integer> list) {
        list.forEach(System.out::println);
    }

    public static Map<Integer,Integer> buildMyMap(List<Integer> myList) {

        Function<Integer,Integer> dajPotege = i -> i * i;

        return myList.stream()
                .collect(Collectors.toMap(Function.identity(),dajPotege));
    }

    public static void printMapResult(Map<Integer, Integer> map) {

        BiConsumer<Integer,Integer> showMap = (a,b) -> {
            System.out.println(a + " - " + b);
        };
        map.forEach(showMap);

    }
}
