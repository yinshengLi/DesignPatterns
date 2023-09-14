package com.test.factory;

/**
 * 具体某个产品的工厂
 *
 * 扩展单个产品容易，扩展产品族不容易
 */
public class CarFactory {

    public Moveable create(){
        return new Car();
    }
}
