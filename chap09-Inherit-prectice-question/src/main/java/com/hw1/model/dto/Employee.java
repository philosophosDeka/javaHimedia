package com.hw1.model.dto;

public class Employee extends Person {

    private int salary;
    private String dept;

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }

    public Employee() {
        super();
    }

    public Employee(String name, int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public String information() {
        return "Employee [" +
                "name=" + name +
                ", age=" + getAge() +
                ", height=" + getHeight() +
                ", weight=" + getWeight() +
                ", salary=" + salary +
                ", dept=" + dept +
                "]";
    }
}
