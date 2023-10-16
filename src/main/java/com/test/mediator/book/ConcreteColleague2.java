package com.test.mediator.book;

public class ConcreteColleague2 extends AbstractColleague {
    //通过构造函数传递中介者
    public ConcreteColleague2(AbstractMediator _mediator) {
        super(_mediator);
    }
    //自有方法
    public void selfMethod2(){
        //处理业务逻辑
        System.out.println("处理2");
    }
    public void depMethod2(){
        //处理自己的逻辑

        //不能处理的委托给中介
        super.mediator.doSomething2();
    }
}
