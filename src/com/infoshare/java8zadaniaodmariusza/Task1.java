package com.infoshare.java8zadaniaodmariusza;

/**
 * Created by bartman3000 on 2017-03-14.
 */
public class Task1 {

    @FunctionalInterface
    interface BuildSomething <T,R> {
        R build(T o1, T o2);
    }

    public static void main(String[] args) {

        BuildSomething<Integer,Float> buildFloat = (Integer i1, Integer i2) -> {
            String s = i1 +"."+i2;
            return Float.parseFloat(s);
        };

        System.out.println(buildFloat.build(3,4));
        System.out.println(buildFloat.build(3,4).getClass().getSimpleName());
    }
}
