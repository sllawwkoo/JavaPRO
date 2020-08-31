package com.gmail.sllawwkoo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        TextContainer tc = new TextContainer();
        Class<?> cls = tc.getClass();
        Method[] methods = cls.getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Saver.class)) {
                SaveTo an = cls.getAnnotation(SaveTo.class);
                method.invoke(tc, an.path());
            }
        }
    }
}
