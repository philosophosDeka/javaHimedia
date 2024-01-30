package com.ohgiraffers.solving.pk_and_impo;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("국어: ");
        int k = sc.nextInt();
        System.out.print("영어: ");
        int e = sc.nextInt();
        System.out.print("수학: ");
        int m = sc.nextInt();

        Q5 q5 = new Q5();
        int sum = q5.sum(k, e, m);
        double avg = q5.avg(k, e, m);

        System.out.println("총점: " + sum);
        System.out.printf("평균: %.2f\n", avg);
    }

    public int sum(int k, int e, int m) {
        return k + e + m;
    }

    public double avg(int k, int e, int m) {
        return (double) (k + e + m) / 3;
    }
}
