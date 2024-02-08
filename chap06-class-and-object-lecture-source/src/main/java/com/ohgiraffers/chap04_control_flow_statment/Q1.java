package com.ohgiraffers.chap04_control_flow_statment;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====== 판다 축제 아르바이트 ======");
        System.out.print("나이가 어떻게 되세요? ");
        int age = sc.nextInt();

        if (age >= 20) {
            System.out.println("판매 가능합니다.");
        } else {
            System.out.println("판매 불가능합니다. 음료 코너에서 골라주세요.");
        }
    }
}
