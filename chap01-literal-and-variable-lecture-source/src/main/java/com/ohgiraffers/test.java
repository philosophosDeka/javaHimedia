package com.ohgiraffers;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("a값 입력: ");
        int a = sc.nextInt();
        System.out.print("b값 입력: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("sum값: " + sum);
        
        if (a == b) {
            System.out.println("a값 " + a + "는 b값 " + b + "과 같음");
        } else if (a < b) {
            System.out.println("a값 " + a + "는 b값 " + b + "보다 작음");
        } else if (a > b) {
            System.out.println("a값 " + a + "는 b값 " + b + "보다 큼");
        }

//        for (int i=1; i<=5; i++) {
//            System.out.println(i + "번째");
//        }

    }
}
