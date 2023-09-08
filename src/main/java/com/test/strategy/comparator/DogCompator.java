package com.test.strategy.comparator;

public class DogCompator implements Comparator<Dog>{
    @Override
    public int compare(Dog o1, Dog o2) {
        if(o1.age < o2.age){
            return -1;
        }else if(o1.age > o2.age){
            return 1;
        }
        return 0;
    }
}
