package com.test.abstractfactory;

/**
 * 产品族
 * 扩展工厂和产品族，很容易实现产品族扩展
 * 容易扩展产品族，扩展族里单个产品不容易
 */
public abstract class AbstractFactory {
    abstract Food createFood();
    abstract Weapon createWeapon();
    abstract Vehicle createVehicle();
}
