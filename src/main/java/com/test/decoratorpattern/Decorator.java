package com.test.decoratorpattern;

public class Decorator extends SchoolReport{
    //首先我要知道是哪个成绩单
    private SchoolReport sr;
    public Decorator(SchoolReport sr){
        this.sr = sr;
    }
    @Override
    public void report() {
        this.sr.report();
    }

    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
