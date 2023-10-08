package com.test.singleton;

/**
 * lazy loading
 * 懒汉式
 * 虽然达到了按需初始化的目的，但却带来了线程不安全的问题
 * 多个线程访问getInstance（），会导致创建的实例不是同一个
 * 在方法内加锁，没有解决问题
 */
public class SingleTest04 {
    private static SingleTest04 INSTANCE;

    private SingleTest04(){}

    public static SingleTest04 getInstance(){
        if(INSTANCE == null){
            synchronized (SingleTest04.class){
                try {//模拟使用
                    Thread.sleep(1);
                }catch (Exception e){
                    e.printStackTrace();
                }
                INSTANCE = new SingleTest04();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args){
        for(int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(SingleTest04.getInstance().hashCode());
            }).start();
        }
    }
}
