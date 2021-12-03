package com.github.willyancaetano.java.features;

public class PatternMatchingInstanceOf {

    public static void main(String[] args) {
        Object obj = "a String";

        if(obj instanceof String str) {
            System.out.println(str.toUpperCase());
        }
    }
}
