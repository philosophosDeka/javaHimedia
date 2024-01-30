package com.ohgiraffers.section01.literal;

public class Application3 {

    public static void main(String[] args) {

        System.out.println("========== 두 개의 문자열 합치기 ==========");
        System.out.println(9 + 9);      //18 : 정수 연산
        System.out.println("9" + 9);    //99 : 문자열 합치기
        System.out.println(9 + "9");    //99 : 문자열 합치기
        System.out.println("9" + "9");  //99 : 문자열 합치기

        System.out.println("========== 세 개의 문자열 합치기 ==========");
        System.out.println(9 + 9 + "9");    //189 : 정수 연산 후 문자열 합치기
        System.out.println(9 + "9" + 9);    //999 : 왼쪽부터 연산하기 때문에 이어붙이기됨.
        System.out.println("9" + 9 + 9);    //999 : '+'연산은 왼쪽에서 오른쪽으로 연산.

        System.out.println("9" + (9 + 9));  //918 : 괄호 안에 값부터 먼저 연산함.

        System.out.println("========== 10과 20의 사칙연산 결과 ==========");
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);
        System.out.println(10 % 20);

        System.out.println("========== 10과 20의 사칙연산 결과 보기 좋게 출력 ==========");
        System.out.println("10과 20의 합: " + (10 + 20)); //주의 : 정수끼리 괄호로 묶지 않으면 문자열 합치기가 일어나서 문자열 합치기가 됨.
        System.out.println("10과 20의 차: " + (10 - 20)); //문자열은 '-' 연산이 불가능하기 때문에 괄호 필수.
        System.out.println("10과 20의 곱: " + (10 * 20));
        System.out.println("10과 20의 나누기 한 몫: " + (10 / 20));
        System.out.println("10과 20의 나누기 한 나머지: " + (10 % 20));

        System.out.println("기차");
        System.out.println("기차" + "칙칙폭폭");
        System.out.println("기차" + 123 + 45 + "출발");
        System.out.println(123 + 45 + "기차" + "출발");

        
    }
}
