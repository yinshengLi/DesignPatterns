package com.test.strategy.comparable;


import java.util.Arrays;

public class TestMain {
    public static void main(String[] args){
        int[] dataArr = {3,5,7,6,1,0,9,10};
        Sorter.sort(dataArr);
        System.out.println(Arrays.toString(dataArr));

        Cat[] catArr = {new Cat(11,1),new Cat(5,2),new Cat(2,2)};
        Sorter.sort2(catArr);
        System.out.println(Arrays.toString(catArr));
    }
}
