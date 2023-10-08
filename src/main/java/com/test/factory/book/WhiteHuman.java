package com.test.factory.book;

public class WhiteHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("白色人种皮肤是白色的");
    }

    @Override
    public void talk() {
        System.out.println("白种人说的话");
    }
}
