package com.test;

public class Pair<T> {
    private T first;
    private T last;
    public Pair(T first,T last){
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getLast() {
        return last;
    }

    public void setLast(T last) {
        this.last = last;
    }
    //静态泛型方法应该使用其他类型区分:
    public static <K> Pair<K> create(K first,K last){
        return new Pair<K>(first,last);
    }

    public boolean same(T t){
        return this == t;
    }
}
