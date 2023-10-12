package com.test.templateMethodPattern.book;

public abstract class AbstractClass {
    //基本方法
    protected abstract void doSomething();
    //基本方法
    protected abstract void doSomething2();
    //模板方法
    final public  void templatedMethod(){
        /**
         * 调用基本方法，完成相关的逻辑
         */
        this.doSomething();
        this.doSomething2();
    }
}
