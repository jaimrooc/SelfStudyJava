package com.jaimrooc.functions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsTypeExample {

    public static void main(String[] args) {
        IntStream infiniteStream = IntStream.iterate(0, x -> x + 1);

        // Example 1
        /*
        infiniteStream.limit(1000) // limit 1000 iterations
                .filter(x -> x % 2 == 0)
                .parallel() // distribute to each processor
                // .allMatch(x -> x % 2 == 0) // verify new data
                .forEach(System.out::println);
         */

        System.out.println(" -------------------- ");

        // Example 2
        List<Integer> resultList = infiniteStream.limit(1000) // limit 1000 iterations
                .filter(x -> x % 2 == 0)
                .boxed() // specified data
                .collect(Collectors.toList()); // convert to list
    }
}