package com.test.factory.video;

/**
 * 简单工厂的可扩展性不好
 */
public class SimpleVehicleFactory {
    public Car createCar(){
        //before process
        return new Car();
    }

    public Plane createPlane(){
        return new Plane();
    }
}
