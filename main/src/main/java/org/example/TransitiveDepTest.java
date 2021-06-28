package org.example;

import java.lang.reflect.InvocationTargetException;

public class TransitiveDepTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class.forName("org.example.RTDep").getDeclaredMethod("run").invoke(null);
    }
}
