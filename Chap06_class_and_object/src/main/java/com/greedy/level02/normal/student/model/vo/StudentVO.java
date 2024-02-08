package com.greedy.level02.normal.student.model.vo;

public class StudentVO {

    int grade;
    int classroom;
    String name;
    double height;
    char gender;

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }
    public int getClassroom() {
        return classroom;
    }
    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }
    public char getGender() {
        return gender;
    }

    public StudentVO() {}

    public StudentVO(int grade, int classroom, String name, double height, char gender) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.height = height;
        this.gender = gender;
    }

    public void printInfomation() {
        System.out.println("====== 실행 결과 ======");
        System.out.println("학년: " + this.grade + "\n" +
                "반: " + this.classroom + "\n" +
                "이름: " +this.name + "\n" +
                "키: " +this.height + "\n" +
                "성별: " +this.gender);
    }
}
