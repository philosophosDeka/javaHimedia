package com.ohgiraffers.solving.pk_and_impo;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("원의 반지름 : ");

        double half = sc.nextInt();

        System.out.printf("원의 둘레(%.1f) : %.1f\n", half, circleRound(half));

        circleArea(half);
    }

    //원의 둘레(반환값이 있는 메소드)
    public static double circleRound(double half) {

        double round = 2 * 3.14 * half;

        return round;
    }

    //원의 넓이(반환값이 없는 메소드)
    public static void circleArea(double half) {
        double area = 3.14 * half * half;

        System.out.println("원의 넓이(" + half + ") : " + area);
    }
}
