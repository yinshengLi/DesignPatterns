package com.test.strategy.tank;

public class TwoFire implements IFire<Two>{
    @Override
    public void fire(Two two) {
        System.out.println("使用"+two.getFireMethod()+"模式");
    }
}
