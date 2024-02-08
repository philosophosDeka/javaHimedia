package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseif {

    public void simpleIfElseIfStatement() {

        /* [ if-else if문 표현식 ]
         *  if(조건식1) {
         *       조건식1이 true일 때 실행할 명령문;
         *  } else if (조건식2) {
         *       조건식1은 false이고, 조건식2는 true일 때 실행할 명령문;
         *  } else {
         *       조건식1, 2 모두 false인 경우 실행할 명령문;
         *  }
         * */

        System.out.println("펑~ 산신령이 나타났다!!");
        System.out.print("어느 도끼가 너의 도끼냐? (1.금도끼 2.은도끼 3.쇠도끼) : ");

        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        if (answer == 1) {
            System.out.println("거짓말 하지 말거라~~! 욕심이 과하구나 이놈!");
        } else if (answer == 2) {
            System.out.println("욕심을 크게 부리진 않았으나 거짓을 말하는구나!");
        } else {
            System.out.println("너는 참으로 정직하구나! 다 가져가거라~!");
        }
        System.out.println("산신령은 사라졌다.");
    }

    public void nestedIfElseIfStatement() {

        Scanner sc = new Scanner(System.in);

        System.out.print("학생 이름 : ");
        String name = sc.nextLine();
        System.out.print("학생 점수 : ");
        int score = sc.nextInt();

        /* 학생의 등급을 저장하기 위한 변수 초기화 */
        String grade;

        if (score >= 90) {
            grade = "A";
            if (score >= 95) {
                grade += "+";
            }
        } else if (score >= 80) {
            grade = "B";
            if (score >= 85) {
                grade += "+";
            }
        } else if (score >= 70) {
            grade = "C";
            if (score >= 75) {
                grade += "+";
            }
        } else if (score >= 60) {
            grade = "D";
            if (score >= 65) {
                grade += "+";
            }
        } else {
            grade = "F";
        }
        System.out.println(name + "학생의 점수는 " + score +
                "이고, 등급은 " + grade + "입니다.");
    }
}
