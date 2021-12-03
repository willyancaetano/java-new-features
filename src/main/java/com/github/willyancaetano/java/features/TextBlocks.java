package com.github.willyancaetano.java.features;

public class TextBlocks {

    public static void main(String[] args) {
        String JSON_STRING
            = "{\r\n" + "\"usuario\" : \"jose_flavio\",\r\n" + "\"hash\" : \"Qnrf8@L9Y29m\n" + "}";

//        System.out.println(JSON_STRING);

        String newFormat = """
            {
                "usuario" : "jose_flavio",
                "hash" : "Qnrf8@L9Y29m"
            }
            """;

        System.out.println(newFormat);
    }
}
