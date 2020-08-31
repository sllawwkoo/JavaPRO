package com.gmail.sllawwkoo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class<?> cls = Test.class;
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyAnatation.class)) {
                MyAnatation anatation = method.getAnnotation(MyAnatation.class);
                method.invoke(null, anatation.a(), anatation.b());
            }
        }
    }
}