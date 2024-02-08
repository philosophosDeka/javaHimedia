package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {

        /* [점수의 합계와 평균 구하기]
        * 1. 길이가 5인 정수형 배열을 만든다.
        * 2. Scanner를 이용하여 학생 5명의 java 시험 점수를 입력 받아, 만든 배열에 저장한다.
        * 3. 배열에 저장한 점수의 합계(int)와 평균(double)을 구하여 출력한다.
        * */

        int[] score = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < score.length; i++) {
            System.out.print((i + 1) + "번째 학생의 java 점수를 입력하세요 : ");
            score[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
//            System.out.println();
        }
        /* 향상된 for문
        * for(int i : score) {
        *       sum += i;
        * }
        */
        double avg = (double) sum / score.length;

        System.out.println("합계 : " + sum + "점");
        System.out.println("평균 : " + avg + "점");
    }
}
