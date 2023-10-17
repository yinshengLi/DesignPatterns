package com.test.decoratorpattern;

public class HighScoreDecorator extends Decorator{

    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportHighScore(){
        System.out.println("这次考试语文最高是75， 数学是78， 自然是80");
    }

    @Override
    public void report() {
        System.out.println("High执行");
        this.reportHighScore();
        super.report();
    }
}
