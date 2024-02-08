package com.ohgiraffers.chap05_array;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 주민등록번호 입력 받기
        System.out.print("주민등록번호 입력 : ");
        String jumin = sc.nextLine();

        // 성별 자리 이후를 *로 가리기
        char[] juminArray = jumin.toCharArray();
        for (int i = 8; i < juminArray.length; i++) {
            juminArray[i] = '*';
        }

        // 가려진 주민등록번호 출력
        System.out.println(new String(juminArray));
    }
}
