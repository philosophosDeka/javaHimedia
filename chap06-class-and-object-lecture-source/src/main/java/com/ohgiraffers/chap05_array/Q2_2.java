package com.ohgiraffers.chap05_array;

import java.util.Scanner;

public class Q2_2 {

    public static void toCharArray(String jumin) {

        char[] juminArray = jumin.toCharArray();
        for (int i = 8; i < juminArray.length; i++) {
            juminArray[i] = '*';
        }
        System.out.println(juminArray);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("주민등록번호 입력: ");
        String jumin = sc.nextLine();

        toCharArray(jumin);
    }
}
