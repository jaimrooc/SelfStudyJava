package com.jaimrooc.functions;

import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class OperatorsExample {

    public static void main(String[] args) {

        // UnaryOperator
        UnaryOperator<String> quote = text -> "\"" + text + "!!\"";

        System.out.println(quote.apply("Hello world"));


        // BiFunction
        BiFunction<String, Integer, String> leftPad = (text, number) -> String.format("%" + number + "s", text);

        System.out.println(leftPad.apply("Java", 10));
    }
}
