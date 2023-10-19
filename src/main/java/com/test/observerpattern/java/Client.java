package com.test.observerpattern.java;


import java.util.Observer;

public class Client {
    public static  void main(String[] args){
        HanFeiZi hanFeiZi = new HanFeiZi();
        Observer lisi = new Lisi();
        hanFeiZi.addObserver(lisi);
        hanFeiZi.haveFun();
        hanFeiZi.haveBreakfast();
    }
}
