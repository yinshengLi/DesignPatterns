package com.test.strategy.tank;

public class OneFire implements IFire<One>{

    @Override
    public void fire(One one) {
        System.out.println("威力："+one.getPowerRange()+"米");
    }
}
