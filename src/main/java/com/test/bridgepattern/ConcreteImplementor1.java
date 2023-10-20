package com.test.bridgepattern;

public class ConcreteImplementor1 implements Implementor{
    @Override
    public void doSomething() {
        System.out.println("实现1.。。");
    }

    @Override
    public void doAnything() {
        System.out.println("任何实现1.。。");
    }
}
