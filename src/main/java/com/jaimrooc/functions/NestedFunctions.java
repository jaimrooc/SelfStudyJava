package com.jaimrooc.functions;

import java.util.function.Function;

public class NestedFunctions {

    public static void main(String[] args) {

        // second execution
        Function<Integer, Integer> multiplyBy3 = x -> {
            System.out.println("Multiply x: " + x + " by 3");
            return x * 3;
        };

        // first execution
        Function<Integer, Integer> add1MultiplyBy3 =
                multiplyBy3.compose(y -> {
                    System.out.println("Add 1 to: " + y);
                    return y + 1;
                });

        // third execution (andThen = Execute after Functions)
        Function<Integer, Integer> andSquare =
                add1MultiplyBy3.andThen(x -> {
                    System.out.println(x + " x " + x);
                    return x * x;
                });


        System.out.println(andSquare.apply(3));
    }
}
