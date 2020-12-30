package com.jaimrooc.functions;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public class SAMExample {
    public static void main(String[] args) {
        Function<Integer, String> addZeros = x -> x < 10 ? "0" + x : String.valueOf(x);

        TriFunction<Integer, Integer, Integer, LocalDate> parseDate = (day, month, year) ->
                LocalDate.parse(year + "-" + addZeros.apply(month) + "-" + addZeros.apply(day));


        TriFunction<Integer, Integer, Integer, Integer> calculateAge = (day, month, year) ->
                Period.between(parseDate.apply(day, month, year), LocalDate.now()).getYears();

        System.out.println(calculateAge.apply(19, 3, 1993));
    }

    @FunctionalInterface
    interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }
}