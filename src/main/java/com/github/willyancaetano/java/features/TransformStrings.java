package com.github.willyancaetano.java.features;

public class TransformStrings {

    public static void main(String[] args) {
        String message = "Hello world!\nThis feature was released on Java 12";
        message = message.transform(String::toUpperCase);
        System.out.println(message);
    }
}
