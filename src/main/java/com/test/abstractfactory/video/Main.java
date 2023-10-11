package com.test.abstractfactory.video;

public class Main {
    public static void main(String[] args){
//        Car car = new Car();
//        car.go();


//        AbstractFactory abstractFactory = new RealFactory();
        AbstractFactory abstractFactory = new MagicFactory();
        Food food = abstractFactory.createFood();
        Vehicle vehicle = abstractFactory.createVehicle();
        Weapon weapon = abstractFactory.createWeapon();
        vehicle.go();
        weapon.shoot();
        food.printName();
    }
}
