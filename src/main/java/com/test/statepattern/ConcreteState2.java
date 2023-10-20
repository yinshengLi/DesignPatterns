package com.test.statepattern;

public class ConcreteState2 extends State{

    @Override
    public void handle1() {
        System.out.println("实体状态2执行行为1");
        super.context.setCurrentState(Context.STATE1);
        super.context.handle1();
    }

    @Override
    public void handle2() {
        System.out.println("实体状态2行为2必须处理的事情。。。。");
    }
}
