package com.test.statepattern;

public class ConcreteState1 extends State{
    @Override
    public void handle1() {
        //本状态下必须处理的逻辑
        System.out.println("实体状态1行为1做的事情。。。");
    }

    @Override
    public void handle2() {
        System.out.println("实体状态1执行行为2.。。。");
        //设置当前状态为stat2
        super.context.setCurrentState(Context.STATE2);
        //过渡到state2状态， 由Context实现
        super.context.handle2();
    }
}
