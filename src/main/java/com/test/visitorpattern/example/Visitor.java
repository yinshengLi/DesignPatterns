package com.test.visitorpattern.example;

import com.test.visitorpattern.common.ConcreteElement1;
import com.test.visitorpattern.common.ConcreteElement2;

public class Visitor implements IVisitor {
    //部门经理的工资系数是5
    private final static int MANAGER_COEFFICIENT = 5;
    //员工的工资系数是2
    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
    //普通员工的工资总和
    private int commonTotalSalary = 0;
    //部门经理的工资总和
    private int managerTotalSalary =0;
    //计算部门经理的工资总和
    private void calManagerSalary(int salary){
        this.managerTotalSalary = this.managerTotalSalary + salary
                *MANAGER_COEFFICIENT ;
    }
    //计算普通员工的工资总和
    private void calCommonSlary(int salary){
        this.commonTotalSalary = this.commonTotalSalary +
                salary*COMMONEMPLOYEE_COEFFICIENT;
    }
    //获得所有员工的工资总和
    public int getTotalSalary(){
        return this.commonTotalSalary + this.managerTotalSalary;
    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        calCommonSlary(commonEmployee.getSalary());
        System.out.println(this.getCommonEmployee(commonEmployee));
    }

    @Override
    public void visit(Manager manager) {
        calManagerSalary(manager.getSalary());
        System.out.println(this.getManagerInfo(manager));
    }

    //组装出基本信息
    private String getBasicInfo(Employee employee){
        String info = "姓名： " + employee.getName() + "\t";
        info = info + "性别： " + (employee.getSex() == Employee.FEMALE?"女":"男");
        info = info + "薪水： " + employee.getSalary() + "\t";
        return info;
    }
    //组装出部门经理的信息
    private String getManagerInfo(Manager manager){
        String basicInfo = this.getBasicInfo(manager);
        String otherInfo = "业绩： "+manager.getPerformance() + "\t";
        return basicInfo + otherInfo;
    }
    //组装出普通员工信息
    private String getCommonEmployee(CommonEmployee commonEmployee){
        String basicInfo = this.getBasicInfo(commonEmployee);
        String otherInfo = "工作： "+commonEmployee.getJob()+"\t";
        return basicInfo + otherInfo;
    }
}
