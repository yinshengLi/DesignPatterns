package com.test.observerpattern.java;


import java.util.Observable;
import java.util.Observer;

public class Lisi implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("李斯： 观察到韩非子活动， 开始向老板汇报了...");
        this.report(arg.toString());
        System.out.println("李斯： 汇报完毕...\n");
    }

    public void report(String context){
        System.out.println("报告给皇帝"+context);
    }
}
