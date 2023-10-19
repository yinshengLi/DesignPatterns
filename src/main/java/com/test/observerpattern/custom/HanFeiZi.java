package com.test.observerpattern.custom;

import java.util.ArrayList;
import java.util.List;

public class HanFeiZi implements IHanFeiZi,Observable{
    private List<Observer> observerList = new ArrayList<>();
    @Override
    public void haveBreakfast() {
        System.out.println("韩非子在吃早饭");
        this.notifyObservers("韩非子在吃早饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子在娱乐");
        this.notifyObservers("韩非子在娱乐");
    }

    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for(Observer observer : this.observerList){
            observer.update(context);
        }
    }
}
