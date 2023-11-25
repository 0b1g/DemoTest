package org.test;

import java.util.StringJoiner;

import static java.lang.System.out;

public class Demo01 {
    public static void main(String[] args) {

        int i = 100;
        // 通过静态方法valueOf(int)创建Integer实例:
        Integer n2 = Integer.valueOf(i);
        out.println(n2);
        // 通过静态方法valueOf(String)创建Integer实例:
        Integer n3 = Integer.valueOf("100");
        System.out.println(n3.intValue());
}
}
