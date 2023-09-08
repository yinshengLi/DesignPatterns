package com.test.strategy.tank;

public class MainTest {
    public static void main(String[] args){
        Tank tank = new Tank();
        tank.startFire(new One("10"),new OneFire());
        tank.startFire(new Two("扫射"),new TwoFire());
    }
}
