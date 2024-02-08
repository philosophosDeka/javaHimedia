package com.hw1.run;

import com.hw1.model.dto.Employee;
import com.hw1.model.dto.Student;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }
        students[0].setName("홍길동");
        students[0].setAge(20);
        students[0].setHeight(178.2);
        students[0].setWeight(70.0);
        students[0].setGrade(1);
        students[0].setMajor("정보시스템공학과");

        students[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        students[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신학과");

//        for (int i = 0; i <students.length; i++) {
//            System.out.println(students[i].information());
//        }
        for (Student s : students) {
            System.out.println(s.information());
        }

        /* 사원 정보*/
        Employee[] employees = new Employee[10];

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("사원정보를 추가하시겠습니까? (y/n) : ");
            String yn = sc.nextLine();
            if (yn.equalsIgnoreCase("y")) {
                for (int i = 0; i < employees.length; i++) {
                    if (employees[i] == null) {
                        System.out.println("사원 정보를 입력합니다.");
                        System.out.print("사원 이름: ");
                        String name = sc.nextLine();
                        System.out.print("나이: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.print("신장: ");
                        double height = sc.nextDouble();
                        System.out.print("몸무게: ");
                        double weight = sc.nextDouble();
                        System.out.print("급여: ");
                        int salary = sc.nextInt();
                        sc.nextLine();
                        System.out.print("부서: ");
                        String dept = sc.nextLine();

                        employees[i] = new Employee(name, age, height, weight, salary, dept);
                        break; // 객체를 추가했으므로 반복문 종료
                    }
                }
            } else if (yn.equalsIgnoreCase("n")) {
                System.out.println("사원 정보 입력을 종료합니다.");
                break;
            } else {
                System.out.println("잘못 입력 됐습니다. y 또는 n만 입력해주세요.");
            }
        }
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e.information());
            }
        }

    }
}
