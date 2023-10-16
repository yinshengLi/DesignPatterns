package com.test.orderpattern;

public class ConcreteCommand1 extends AbstractCommand{
    private AbstractReceiver receiver;
    //构造函数传递接收者
    public ConcreteCommand1(AbstractReceiver _receiver){
        this.receiver = _receiver;
    }
    //实现命令
    @Override
    public void execute() {
        //业务处理
        this.receiver.doSomething();
    }
}
