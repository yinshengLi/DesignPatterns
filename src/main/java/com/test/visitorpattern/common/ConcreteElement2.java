package com.test.visitorpattern.common;

public class ConcreteElement2 extends Element{
    //完善业务逻辑
    @Override
    public void doSomething() {
        System.out.println("做爱做的事情2");
    }
    //允许那个访问者访问
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
