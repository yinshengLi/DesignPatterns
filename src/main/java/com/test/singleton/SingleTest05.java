package com.test.singleton;

/**
 * lazy loading
 * 懒汉式
 * 在方法内加锁，双重检查解决了多线程创建多个实例的问题
 */
public class SingleTest05 {
    private static volatile SingleTest05 INSTANCE;//JIT 编译会指令重排 ，所以药加上volatile

    private SingleTest05(){}

    public static SingleTest05 getInstance(){
        if(INSTANCE == null){
            //双重检测
            synchronized (SingleTest05.class){
                if(INSTANCE == null){
                    try {//模拟使用
                        Thread.sleep(1);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    INSTANCE = new SingleTest05();
                }

            }


        }
        return INSTANCE;
    }

    public static void main(String[] args){
        for(int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(SingleTest05.getInstance().hashCode());
            }).start();
        }
    }
}
