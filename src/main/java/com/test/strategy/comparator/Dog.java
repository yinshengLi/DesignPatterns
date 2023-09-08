package com.test.strategy.comparator;

public class Dog {
     int age;

    public Dog(int age){
        this.age = age;
    }
    @Override
    public String toString(){
        return "{Dog age:"+this.age +"}";
    }
}
