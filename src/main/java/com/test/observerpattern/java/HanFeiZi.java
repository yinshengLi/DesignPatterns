package com.test.observerpattern.java;

import java.util.Observable;

public class HanFeiZi extends Observable implements IHanFeiZi {
    @Override
    public void haveBreakfast() {
        System.out.println("韩非子在吃早饭");
        //通知所有的观察者
        super.setChanged();
        super.notifyObservers("韩非子在吃早饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子在娱乐");
        super.setChanged();
        super.notifyObservers("韩非子在娱乐");
    }
}
