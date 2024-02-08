package com.ohgiraffers.chap04_control_flow_statment;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====== 판다 숫자뽑기 ======");
        System.out.print("당첨 번호가 어떻게 되세요? ");
        int gift = sc.nextInt();

        if (0 < gift && 10 >= gift) {
            if (gift % 2 == 0) {
                System.out.println("짝수네요, 모자 선물입니다!");
            } else {
                System.out.println("홀수네요, 인형 선물입니다!");
            }
        } else {
            System.out.println("당첨 번호는 1~10 사이에만 있어요.");
        }

    }
}
