package com.test.decoratorpattern;

public class SortDecorator extends Decorator{
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }
    private void reportSort(){
        System.out.println("我是排名第38名...");
    }

    @Override
    public void report() {
        System.out.println("Sort执行");
        super.report();
        this.reportSort();
    }
}
