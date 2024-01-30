package com.ohgiraffers.solving.pk_and_impo;

public class Q2 {
    private static int num;
    private static String snum;

    public static void main(String[] args) {
        num = 3;

        Q2 q2 = new Q2();
        q2.checkNum(num);
    }

    public void checkNum(int num) {
        snum = (num % 2 == 0) ? "짝" : "홀";
        System.out.println("수는 " + num + ", " + snum + "입니다.");
    }
}

