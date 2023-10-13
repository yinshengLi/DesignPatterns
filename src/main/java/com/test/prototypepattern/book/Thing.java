package com.test.prototypepattern.book;

import java.util.ArrayList;

/**
 * 深拷贝
 */
public class Thing implements Cloneable{
    //定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<>();
    @Override
    public Thing clone(){
        Thing thing = null;
        try{
           thing = (Thing) super.clone();
           //增加了这句，把内部引用对象也拷贝， 变成深拷贝
           thing.arrayList = (ArrayList<String>)this.arrayList.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return thing;
    }
}
