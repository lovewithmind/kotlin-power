package com.company.kotlin.generics;

import java.util.List;

public class JavaGenerics {
    public static <T> String genericToString(T something){
        return "The thing passed in to this function is " + something;
    }

    public static void main(String[] args) {
        var genericClassA = new GenericJavaClass<>(100);
        var genericClassB = new GenericJavaClass<>("Hello World");
        var genericClassC = new GenericJavaClass<>(List.of("A", "B"));

        System.out.println("Java Example A: " + genericClassA.getState());
        System.out.println("Java Example B: " + genericClassB.getState());
        System.out.println("Java Example C: " + genericClassC.getState());

        System.out.println(genericToString("Hello"));
        System.out.println(genericToString(100));
        System.out.println(genericToString(List.of("A", "B")));
    }
}

class GenericJavaClass<T> {
    private T state;

    public GenericJavaClass(T state) {
        this.state = state;
    }

    public T getState() {
        return state;
    }
}