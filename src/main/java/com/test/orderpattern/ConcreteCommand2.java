package com.test.orderpattern;

public class ConcreteCommand2 extends AbstractCommand{
    private AbstractReceiver receiver;
    //构造函数传递接收者
    public ConcreteCommand2(AbstractReceiver _receiver){
        this.receiver = _receiver;
    }
    //实现命令
    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
