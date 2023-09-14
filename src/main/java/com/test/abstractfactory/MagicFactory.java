package com.test.abstractfactory;

public class MagicFactory extends AbstractFactory{
    @Override
    Food createFood() {
        return new MagicFood();
    }

    @Override
    Weapon createWeapon() {
        return new MagicWeapon();
    }

    @Override
    Vehicle createVehicle() {
        return new MagicVehicle();
    }
}
