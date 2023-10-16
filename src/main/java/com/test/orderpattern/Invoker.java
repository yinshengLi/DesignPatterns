package com.test.orderpattern;

public class Invoker {
    private AbstractCommand command;


    public void setCommand(AbstractCommand command) {
        this.command = command;
    }
    //执行命令
    public void action(){
        this.command.execute();
    }
}
