package com.test.strategy.comparator;


import java.util.Arrays;

public class TestMain {
    public static void main(String[] args){

        Sorter2<Dog> sorter2 = new Sorter2<>();
        Dog[] dogArr = {new Dog(11),new Dog(5),new Dog(2)};
        sorter2.sort(dogArr,new DogCompator());
        System.out.println(Arrays.toString(dogArr));
    }
}
