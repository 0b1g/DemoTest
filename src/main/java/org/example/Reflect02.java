package org.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static java.lang.Class.*;

public class Reflect02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {

        Class cls = Person.class;

        Person person = new Person("tom",11);
        Class aClass = person.getClass();
//        Class  c= Class.forName("src.main.java.org.example.Reflect02");
        //获取字段
        Field f1 = aClass.getDeclaredField("age");
        f1.setAccessible(true);
        System.out.println(f1.get(person));

        //调用方法
        Method m1 = cls.getMethod("study");
        m1.invoke(person);

        //调用构造方法
        Constructor constructor = cls.getConstructor(String.class, int.class);
        Object bob = constructor.newInstance("bob", 125);
        System.out.println(bob);

    }
}

class Person{
    public String name = "jack";
    private int age = 10;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void study(){
        System.out.println("学习");
    }
    private void game(){
        System.out.println("游戏");
    }
}