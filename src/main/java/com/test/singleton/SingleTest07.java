package com.test.singleton;

/**
 * 枚举单例
 * 不仅可以解决线程同步，还可以防止反序列化
 */
public enum SingleTest07 {
    INSTANCE;
    public static void main(String[] args){
        for(int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(SingleTest07.INSTANCE.hashCode());
            }).start();
        }
    }
}
