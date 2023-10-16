package com.test.mediator.book;

/**
 * 同事类
 * 每个同事类依赖中介者
 */
public class ConcreteColleague1 extends AbstractColleague {
    //通过构造函数传递中介者
    public ConcreteColleague1(AbstractMediator _mediator) {
        super(_mediator);
    }
    //自有方法
    public void selfMethod1(){
        //处理业务逻辑
        System.out.println("处理1");
    }
    public void depMethod1(){
        //处理自己的逻辑

        //不能处理的委托给中介
        super.mediator.doSomething1();
    }
}
