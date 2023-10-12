package com.test.templateMethodPattern.book;

public class Client {
    public static void main(String[] args){
        AbstractClass class1 = new ConcreteClass1();
        AbstractClass class2 = new ConcreteClass2();
        class1.templatedMethod();
        class2.templatedMethod();
    }
}
