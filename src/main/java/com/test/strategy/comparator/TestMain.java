package com.test.strategy.comparator;


import java.util.Arrays;

public class TestMain {
    public static void main(String[] args){

        Sorter2<Dog> sorter2 = new Sorter2<>();
        Dog[] dogArr = {new Dog(11),new Dog(5),new Dog(2)};
        //从小到大
        sorter2.sort(dogArr,new DogCompator());
        System.out.println(Arrays.toString(dogArr));
        //使用lamba表达式,从大到小
        sorter2.sort(dogArr,(o1,o2)->{
            if(o1.age > o2.age){
                return -1;
            }else if(o1.age < o2.age){
                return 1;
            }
            return 0;
        });
        System.out.println(Arrays.toString(dogArr));
    }
}
