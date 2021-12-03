package com.github.willyancaetano.java.features;

public class IndentStrings {

    public static void main(String[] args) {
        String message = "Hello world!\nThis feature was released on Java 12";
        message = message.indent(3);
        System.out.println(message);
    }
}
