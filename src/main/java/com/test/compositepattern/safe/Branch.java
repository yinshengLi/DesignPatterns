package com.test.compositepattern.safe;

import java.util.ArrayList;

public class Branch extends Corp{
    //领导下边有哪些下级领导和小兵
    ArrayList<Corp> subordinateList = new ArrayList<Corp>();
    public Branch(String _name, String _position, int _salary) {
        super(_name, _position, _salary);
    }

    //增加一个下属， 可能是小头目， 也可能是个小兵
    public void addSubordinate(Corp corp) {
        this.subordinateList.add(corp);
    }
    //我有哪些下属
    public ArrayList<Corp> getSubordinate() {
        return this.subordinateList;
    }
}
