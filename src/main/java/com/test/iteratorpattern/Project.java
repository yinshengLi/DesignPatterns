package com.test.iteratorpattern;

import java.util.ArrayList;

public class Project implements IProject{
    //定义一个项目列表， 说有的项目都放在这里
    private ArrayList<IProject> projectList = new ArrayList<IProject>();
    //项目名称
    private String name = "";
    //项目成员数量
    private int num = 0;
    //项目费用
    private int cost = 0;
    private Project(String name,int num,int cost){
        //赋值到类的成员变量中
        this.name = name;
        this.num = num;
        this.cost=cost;
    }
    public Project(){

    }
    @Override
    public void add(String name, int num, int cost) {
        this.projectList.add(new Project(name,num,cost));
    }

    @Override
    public String getProjectInfo() {
        String info = "";
//获得项目的名称
        info = info+ "项目名称是： " + this.name;
//获得项目人数
        info = info + "\t项目人数: "+ this.num;
//项目费用
        info = info+ "\t 项目费用： "+ this.cost;
        return info;
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projectList);
    }
}
