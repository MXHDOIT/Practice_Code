package com;

import java.lang.reflect.Field;

public class ReflectDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class p = Person.class;

        Field[] field = p.getFields();
        for(Field x:field){
            System.out.println(x);
        }

        Field a = p.getField("a");
        Object o = a.get(new Person());
        System.out.println(o);
        a.set(new Person(),9);


    }
}
