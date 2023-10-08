package com.test.factory.book;

/**
 * 场景类
 */
public class NvWa {
    public static void main(String[] args){
        //声明八卦炉
        AbstractHumanFactory bagualu = new HumanFactory();
        //造人
        System.out.println("--------白色-----------");
        Human whiteHuman = bagualu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        System.out.println("------黑色------------");
        Human blackHuman = bagualu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        System.out.println("-----------黄色----------------");
        Human yellowHuman = bagualu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
