package com.test.observerpattern.custom;

public class Client {
    public static  void main(String[] args){
        HanFeiZi hanFeiZi = new HanFeiZi();
        Observer lisi = new Lisi();
        Observer zhaogao = new ZhaoGao();
        hanFeiZi.addObserver(lisi);
        hanFeiZi.addObserver(zhaogao);
        hanFeiZi.haveFun();
        hanFeiZi.haveBreakfast();
    }
}
