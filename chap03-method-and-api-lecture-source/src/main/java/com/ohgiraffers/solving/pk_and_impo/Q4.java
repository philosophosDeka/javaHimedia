package com.ohgiraffers.solving.pk_and_impo;

public class Q4 {
    public static void main(String[] args) {

        int a = 7;
        int b = 5;
        int c = 8;
        System.out.println("a의 값: " + a + "\nb의 값: " + b +
                        "\nc의 값: " + c);
        System.out.println();

        Q4 q4 = new Q4();
        q4.max(a, b, c);
        q4.min(a, b, c);
    }

    public void max(int a, int b, int c) {
        int resultMax = (a > b && a > c) ? a : (b > c) ? b : c;
        System.out.println("최대값: " + resultMax);
    }

    public void min(int a, int b, int c) {
        int resultMin = (a < b && a < c) ? a : (b < c) ? b : c;
        System.out.println("최소값: " + resultMin);
    }
}
