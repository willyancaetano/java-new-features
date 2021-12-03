package com.github.willyancaetano.java.features;

import java.util.UUID;

public class Records {

    public static void main(String[] args) {
        User user = new User(UUID.randomUUID().toString(), "thiagomsol");
        System.out.println(user.id());
        System.out.println(user.name());
        System.out.println(user.toString());
    }
}

record User(String id, String name) {}