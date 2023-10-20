package com.test.bridgepattern;

public class ConcreteImplementor2 implements Implementor{
    @Override
    public void doSomething() {
        System.out.println("实现2。。");
    }

    @Override
    public void doAnything() {
        System.out.println("任何实现2.。。");
    }
}
