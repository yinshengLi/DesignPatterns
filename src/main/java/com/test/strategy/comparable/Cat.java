package com.test.strategy.comparable;

public class Cat implements Comparable<Cat>{
     int height;
     int weight;
    public Cat(int height,int weight){
        this.height = height;
        this.weight = weight;
    }

    public int compareTo(Cat c) {
        if(this.height < c.height){
            return -1;
        }else if(this.height > c.height){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "{Cat height:"+this.height +",weight:"+ this.weight+"}";
    }
}
