package com.company.kotlin.immutability;

public class Application {
    public static void main(String[] args) {
        String str = "Hello World";
        final ExampleClass exampleClass = new ExampleClass(str);
        sideEffectFunction(exampleClass);
        System.out.println(exampleClass.str);
    }

    private static void sideEffectFunction(ExampleClass mutableObject) {
        mutableObject.str = "asds";
    }
}


class ExampleClass {
     String str;

    public ExampleClass(String str) {
        this.str = str;
    }
}