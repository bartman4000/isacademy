package com.infoshare.task1;

import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MyJava8Class {

    public static Collection getFilteredCollecion(Collection collection, Predicate predicate) {
        return  (Collection) collection.stream().filter(predicate).collect(Collectors.toList());
    }

    public static void printFilteredCollection(Collection collection) {
        collection.forEach( e -> System.out.println(e));
    }
}
