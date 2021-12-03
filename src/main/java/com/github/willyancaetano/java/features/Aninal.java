package com.github.willyancaetano.java.features;

public sealed interface Aninal permits Monkey, Snake{

}

final class Monkey implements Aninal{ }

non-sealed class Snake implements Aninal{};
