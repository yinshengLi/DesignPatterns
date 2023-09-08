package com.test.singleton;

/**
 * 静态内部类方式
 * JVM保证单例（只会加载一次类）
 * 加载外部类时不会加载内部类，调用的时候才会加载，这样可以实现懒加载
 * 完美方式之一
 */
public class SingleTest06 {

    private SingleTest06(){}

    private static class SingleTestHolder{
        private static final SingleTest06 INSTANCE = new SingleTest06();
    }

    public static SingleTest06 getInstance(){
        return SingleTestHolder.INSTANCE;
    }

    public static void main(String[] args){
        for(int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(SingleTest06.getInstance().hashCode());
            }).start();
        }
    }
}
