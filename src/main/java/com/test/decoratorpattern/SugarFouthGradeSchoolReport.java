package com.test.decoratorpattern;

public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport{
    //定义美化方法,先给老爸说学校最高成绩
    private void reportHighSchore(){
        System.out.println("这次考试语文最高是75， 数学是78， 自然是80");
    }
//在老爸看完毕成绩单后， 我再汇报学校的排名情况
    private void reportSort(){
        System.out.println("我是排名第38名...");
    }

    @Override
    public void report() {
        this.reportHighSchore();//先说最高成绩
        super.report();//然后老爸看成绩单
        this.reportSort();//然后告诉老爸学习学校排名
    }
}
