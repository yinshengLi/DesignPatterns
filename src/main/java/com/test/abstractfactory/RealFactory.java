package com.test.abstractfactory;

public class RealFactory extends AbstractFactory{
    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Weapon createWeapon() {
        return new LaserSword();
    }

    @Override
    Vehicle createVehicle() {
        return new Car();
    }
}
