package com.ohgiraffers.chap02_solving;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();

        String result = (num % 2 == 0) ? "짝수" : "홀수";

        System.out.println("입력하신 수는 " + result + "입니다.");

    }
}
