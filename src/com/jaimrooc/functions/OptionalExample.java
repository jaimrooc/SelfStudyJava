package com.jaimrooc.functions;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

    // Load data
    static List<Optional<String>> getOptionalNames() {
        List<Optional<String>> list = new LinkedList<>();

        list.add(Optional.empty());
        list.add(Optional.of("One"));
        list.add(Optional.ofNullable(null));
        list.add(Optional.of("Two"));
        list.add(Optional.empty());
        list.add(Optional.of("Three"));

        return list;
    }

    public static void main(String[] args) {

        // first example
        List<Optional<String>> optionalNames = getOptionalNames();

            for (Optional<String> name : optionalNames) {
                if (name.isPresent()) {
                System.out.println(name.get());
            }
        }

        System.out.println("=============");

        // second example
        optionalNames.forEach(nameValue -> nameValue.ifPresent(System.out::println));
    }
}
