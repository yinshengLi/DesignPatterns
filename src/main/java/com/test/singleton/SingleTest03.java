package com.test.singleton;

/**
 * lazy loading
 * 懒汉式
 * 加锁解决了多线程创建不同实例的问题，但是效率降低
 */
public class SingleTest03 {
    private static SingleTest03 INSTANCE;

    private SingleTest03(){}

    /**
     * 加锁
     * @return
     */
    public static synchronized SingleTest03 getInstance(){
        if(INSTANCE == null){
            try {//模拟使用
                Thread.sleep(1);
            }catch (Exception e){
                e.printStackTrace();
            }
            INSTANCE = new SingleTest03();
        }
        return INSTANCE;
    }

    public static void main(String[] args){
        for(int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(SingleTest03.getInstance().hashCode());
            }).start();
        }
    }
}
