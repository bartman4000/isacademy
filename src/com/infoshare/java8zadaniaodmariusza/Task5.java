package com.infoshare.java8zadaniaodmariusza;

import java.util.Arrays;
import java.util.List;

/**
 * Created by bartman3000 on 2017-03-14.
 */
public class Task5 {

    private static List<String> myList
            = Arrays.asList("Ala", "Marcin", "Kuba", "Łukasz", "stefan", "", "andrzej", "imieZKropka.", "imieZ,Przecinkiem");

    private static void reverseWords(String s)
    {
        String newString = new StringBuffer(s).reverse().toString();
        System.out.println(newString);
    }

    public static void main(String[] args) {

        myList.forEach(Task5::reverseWords);
    }

}
