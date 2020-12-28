package com.jaimrooc.functions;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        // first implementation
        System.out.println(" ======= first implementation  ======= ");

        Function<Integer, Integer> squareFunction = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };
        System.out.println(squareFunction.apply(5));
        System.out.println(squareFunction.apply(25));

        // second implementation
        System.out.println(" ======= second implementation  ======= ");
        Function<Integer, Boolean> isOdd = x -> x % 2 != 0;
        System.out.println(isOdd.apply(5));
        System.out.println(isOdd.apply(20));
    }
}
