package com.test.flyweightpattern;

public class ConcreteFlywight1 extends Flyweight{
    //接受外部状态
    public ConcreteFlywight1(String _Extrinsic){
        super(_Extrinsic);
    }
    //根据外部状态进行逻辑处理
    @Override
    public void operate() {
        System.out.println("处理逻辑1"+super.Extrinsic);
    }
}
