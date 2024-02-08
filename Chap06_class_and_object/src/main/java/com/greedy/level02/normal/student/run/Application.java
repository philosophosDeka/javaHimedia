package com.greedy.level02.normal.student.run;

import com.greedy.level02.normal.student.model.vo.StudentVO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("학년 : ");
        int grade = sc.nextInt();

        System.out.print("반 : ");
        int classroom = sc.nextInt();
        sc.nextLine();

        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("키 : ");
        double height = sc.nextDouble();
        sc.nextLine();

        System.out.print("성별 : ");
        char gender = sc.nextLine().charAt(0);

        StudentVO stu = new StudentVO(grade, classroom, name, height, gender);
        stu.printInfomation();
    }
}
