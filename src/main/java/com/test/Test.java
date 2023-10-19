package com.test;

public class Test {
    public static void main(String[] args){
        Pair<String> p = new Pair("123","ff");
        System.out.println(p.getFirst());
        System.out.println(p.getLast());

        Pair<Integer> m = Pair.create(12,23);
        System.out.println(m.getFirst());
        System.out.println(m.getLast());
        Class c1 = p.getClass();
        Class c2 = m.getClass();
        System.out.println(c1 == c2);
    }
}
