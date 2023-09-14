package com.test.singleton;

/**
 * lazy loading
 * 懒汉式
 * 虽然达到了按需初始化的目的，但却带来了线程不安全的问题
 * 多个线程访问getInstance（），会导致创建的实例不是同一个
 */
public class SingleTest02 {
    private static SingleTest02 INSTANCE;

    private SingleTest02(){}

    public static SingleTest02 getInstance(){
        if(INSTANCE == null){
            try {//模拟使用
                Thread.sleep(1);
            }catch (Exception e){
                e.printStackTrace();
            }
            INSTANCE = new SingleTest02();
        }
        return INSTANCE;
    }

    public static void main(String[] args){
        for(int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(SingleTest02.getInstance().hashCode());
            }).start();
        }
    }
}
