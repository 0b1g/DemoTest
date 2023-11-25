package org.example;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reelect03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        Runtime runtime = Runtime.getRuntime();
//        Process exec = runtime.exec("calc.exe");

        Class cls  =Class.forName("java.lang.Runtime");
        Method m1 = cls.getMethod("getRuntime");
        Runtime run = (Runtime) m1.invoke(null,null);

        Method m2 = cls.getMethod("exec",String.class);
        m2.invoke(run,"calc.exe");




    }
}
