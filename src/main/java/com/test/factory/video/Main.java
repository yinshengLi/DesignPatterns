package com.test.factory.video;

public class Main {
    public static void main(String[] args){
//        Car car = new Car();
//        car.go();
        CarFactory carFactory = new CarFactory();
        Moveable moveable = carFactory.create();
        moveable.go();
    }
}
