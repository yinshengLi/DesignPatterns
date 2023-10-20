package com.test.visitorpattern.common;

public class Client {
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            Element e1 = ObjectStruture.createElement();
            //接受访问者访问
            e1.accept(new Visitor());
        }
    }
}
