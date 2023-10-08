package com.test.factory.book;

public class YellowHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("黄色人种皮肤是黄色色的");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说的话");
    }
}
