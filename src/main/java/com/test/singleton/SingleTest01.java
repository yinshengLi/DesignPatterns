package com.test.singleton;

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单使用，推荐使用
 * 唯一缺点：不管用到与否，类加载时就实例化
 */
public class SingleTest01 {
    private static final  SingleTest01  INSTANCE = new SingleTest01();
    //私有构造方法 无法从外部new 进行创建
    private SingleTest01(){}

    public static SingleTest01 getInstance(){
        return INSTANCE;
    }
    public static void main(String[] args){
        SingleTest01 singleTest01 = SingleTest01.getInstance();
        SingleTest01 singleTest02 = SingleTest01.getInstance();
        System.out.println(singleTest01 == singleTest02);
    }

}
