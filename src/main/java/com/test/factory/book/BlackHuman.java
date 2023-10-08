package com.test.factory.book;

public class BlackHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黑色人种皮肤是黑色的");
    }

    @Override
    public void talk() {
        System.out.println("黑人说的话");
    }
}
