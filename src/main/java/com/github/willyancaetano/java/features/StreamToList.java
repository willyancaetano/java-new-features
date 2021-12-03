package com.github.willyancaetano.java.features;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToList {

    public static void main(String[] args) {
        Stream<String> letters = Stream.of("A", "B", "C");
        List<String> collect = letters.collect(Collectors.toList());

        List<String> strings = letters.toList();
    }
}
