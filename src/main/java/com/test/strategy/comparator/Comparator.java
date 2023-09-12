package com.test.strategy.comparator;

public interface Comparator<T> {
    int compare(T o1,T o2);
    //默认方法  可以解决接口升级的问题
    default void m(){
        System.out.println("1");
    }
    //静态方法  一般是工具方法
    static void m2(){
        System.out.println("2");
    }
}
