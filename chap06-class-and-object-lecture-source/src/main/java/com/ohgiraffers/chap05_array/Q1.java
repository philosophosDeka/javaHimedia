package com.ohgiraffers.chap05_array;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] fruit = new String[] {"딸기", "바나나", "복숭아", "키위", " 사과"};

        System.out.print("정수 입력(0~4) : ");
        int num = sc.nextInt();

        for (int i = 0; i < fruit.length; i++) {
            if (num == 0) {
                System.out.println(fruit[0]);
                break;
            } else if (num == 1) {
                System.out.println(fruit[1]);
                break;
            } else if (num == 2) {
                System.out.println(fruit[2]);
                break;
            } else if (num == 3) {
                System.out.println(fruit[3]);
                break;
            } else if (num == 4) {
                System.out.println(fruit[4]);
                break;
            } else {
                System.out.println("준비된 과일이 없습니다.");
                break;
            }
        }
    }
}
