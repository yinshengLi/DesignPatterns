package com.test.factory.book.singleton;

import java.lang.reflect.Constructor;

/**
 * 生产单例的工厂类
 */
public class SingletonFactory {
    private static Singleton singleton;
    static {
        try{
            Class c = Class.forName(Singleton.class.getName());
            //获得午餐构造
            Constructor constructor = c.getDeclaredConstructor();
            //设置午餐构造是可以访问的
            constructor.setAccessible(true);
            //产生一个对象
            singleton = (Singleton) constructor.newInstance();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static Singleton getSingleton(){
        return singleton;
    }


}
