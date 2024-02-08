package com.ohgiraffers.chap04_control_flow_statment;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        String tomato = "";

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                tomato += "마";
            } else {
                tomato += "토";
            }
        }
        System.out.print(tomato);
    }
}
