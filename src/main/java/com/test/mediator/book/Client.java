package com.test.mediator.book;

public class Client {
    public static void main(String[] args){
        AbstractMediator mediator = new ConcreteMediator();
        ConcreteColleague1 c1 = new ConcreteColleague1(mediator);
        c1.selfMethod1();

        ConcreteColleague2 c2 = new ConcreteColleague2(mediator);
        c2.selfMethod2();
    }
}
