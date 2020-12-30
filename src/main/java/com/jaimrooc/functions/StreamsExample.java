package com.jaimrooc.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsExample {

    // Load data
    static List<String> loadData() {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Node js");
        list.add("JavaScript");
        list.add("Rubi");
        return list;
    }

    public static void main(String[] args) {
        List<String> coursesList = loadData();

        // -------------------------
        System.out.println("====== Standard version (iterate)");

        for (String course : coursesList) {
            String courseName = course.toLowerCase().replace(" ", "");
            System.out.println("Course: " + courseName);
        }

        // -------------------------
        System.out.println("====== Stream with many objects version");

        Stream<String> coursesSteam = Stream.of("Java", "Python", "Node js", "JavaScript", "Rubi");
        Stream<String> coursesFilterByJavaName = coursesSteam.filter(course -> course.contains("Java"));
        Stream<Integer> courseLengthStream = coursesFilterByJavaName.map(course -> course.length());
        Optional<Integer> longestName = courseLengthStream.max((x, y) -> x - y);
        System.out.println(longestName);

        // -------------------------
        System.out.println("====== Stream with chaining (iterate)");
        coursesList.stream()
                .map(course -> course + "!!")
                .filter(course -> course.contains("Java"))
                .forEach(System.out::println);
    }
}
