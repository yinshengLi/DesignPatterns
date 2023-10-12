package com.test.templateMethodPattern.book;

public class ConcreteClass2 extends AbstractClass{
    @Override
    protected void doSomething() {
        //逻辑处理
        System.out.println("2处理事情1");
    }

    @Override
    protected void doSomething2() {
        //逻辑处理
        System.out.println("2处理事情2");
    }
}
