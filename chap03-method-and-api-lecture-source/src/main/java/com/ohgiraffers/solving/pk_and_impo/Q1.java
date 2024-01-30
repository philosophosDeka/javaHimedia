package com.ohgiraffers.solving.pk_and_impo;

public class Q1 {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;

        Q1 q1 = new Q1();
        System.out.println("더하기: " + q1.sum(a, b));
        System.out.println("빼기: " + q1.minus(a, b));
        System.out.println("곱하기: " + q1.multi(a, b));
        System.out.println("나누기: " + q1.divide(a, b));

    }
    //덧셈 메소드
    public int sum(int a, int b) {
        return a + b;
    }
    //뺄셈 메소드
    public int minus(int a, int b) {
        return a - b;
    }
    //곱셈 메소드
    public int multi(int a, int b) {
        return a * b;
    }
    //나눗셈 메소드
    public int divide(int a, int b) {
        return a / b;
    }
}
