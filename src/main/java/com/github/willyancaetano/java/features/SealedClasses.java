package com.github.willyancaetano.java.features;

public class SealedClasses {

}

abstract sealed class Person
    permits Employee, Manager  {

}

final class Employee extends Person {}

non-sealed class Manager extends Person {}

class Director extends Manager {}