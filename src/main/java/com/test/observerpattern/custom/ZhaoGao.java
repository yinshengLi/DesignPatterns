package com.test.observerpattern.custom;

public class ZhaoGao implements Observer{
    @Override
    public void update(String context) {
        System.out.println("赵高： 观察到韩非子活动， 开始向老板汇报了...");
        this.report(context);
        System.out.println("赵高： 汇报完毕...\n");
    }
    public void report(String context){
        System.out.println("报告给皇帝"+context);
    }
}
