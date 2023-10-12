package com.test.builderpattern.book;

public class Client {
    public static void main(String[] args){
        Director director = new Director();
        //10辆A类型的奔驰车
        for(int i=0;i<10; i++){
            director.getABenzModel().run();
        }
        //10辆B类型的奔驰车
        for(int i=0;i<10; i++){
            director.getBBenzModel().run();
        }
    }
}
