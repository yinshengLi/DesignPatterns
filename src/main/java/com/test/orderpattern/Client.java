package com.test.orderpattern;

public class Client {

    public static void main(String[] args){
        //调用者
        Invoker invoker = new Invoker();
        //接收者
        AbstractReceiver receiver = new ConcreteReciver1();
        //定义个发送给接受者的命令
        AbstractCommand command = new ConcreteCommand1(receiver);
        invoker.setCommand(command);
        invoker.action();



    }
}
