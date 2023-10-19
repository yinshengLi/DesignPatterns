package com.test.mementopattern;

public class Client {
    public static void main(String[] args){
        Originator originator = new Originator();
        originator.setState("很开心");
        System.out.println("状态：" +originator.getState());
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.setState("伤心");
        System.out.println("状态：" +originator.getState());
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("状态：" +originator.getState());

    }
}
