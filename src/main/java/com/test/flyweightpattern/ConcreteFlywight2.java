package com.test.flyweightpattern;

public class ConcreteFlywight2 extends Flyweight{
    //接受外部状态
    public ConcreteFlywight2(String _Extrinsic){
        super(_Extrinsic);
    }
    //根据外部状态进行逻辑处理
    @Override
    public void operate() {
        System.out.println("处理逻辑2"+super.Extrinsic);
    }
}
