package com.gmail.sllawwkoo;

public class Test {

    @MyAnatation(a = 2, b = 5)
    public static void sum(int a, int b) {
        System.out.println(a + b);
    }
}