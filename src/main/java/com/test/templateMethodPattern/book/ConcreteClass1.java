package com.test.templateMethodPattern.book;

public class ConcreteClass1 extends AbstractClass{
    @Override
    protected void doSomething() {
        //逻辑处理
        System.out.println("1处理事情1");
    }

    @Override
    protected void doSomething2() {
        //逻辑处理
        System.out.println("1处理事情2");
    }
}
