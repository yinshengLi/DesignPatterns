package com.test.strategy.tank;

public class Tank<T> {

    public void startFire(T t,IFire<T> iFire){
        iFire.fire(t);
    }
}
