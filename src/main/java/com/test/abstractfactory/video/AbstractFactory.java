package com.test.abstractfactory.video;

/**
 * 产品族
 *
 * 扩展产品族不容易，新增一个产品族需要把工厂都修改了
 * 扩展产品族里的产品容易，只要新增具体的工厂
 */
public abstract class AbstractFactory {
    abstract Food createFood();
    abstract Weapon createWeapon();
    abstract Vehicle createVehicle();
}
