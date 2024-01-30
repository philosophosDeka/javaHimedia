package com.ohgiraffers.chap02_solving;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        int month = 1;
        int day = 16;
        String name = "이유란";

        String coupon = (month <= 6 && day <= 15) ? "배민쿠폰" :
                (month >= 7 && day >= 16) ? "스타벅스 커피" : "사탕";

        System.out.println(name + "님의 선물은 " + coupon + "입니다.");

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("월: ");
//        int userMonth = sc.nextInt();
//        System.out.print("일: ");
//        int userDay = sc.nextInt();
//
//        String gift;
//        if (userMonth <= 6 && userDay <= 15) {
//            gift = "배민쿠폰";
//        } else if (userMonth >= 7 && userDay >= 15) {
//            gift = "스타벅스 커피";
//        } else {
//            gift = "사탕";
//        }
//        System.out.println(name + "님의 선물은 " + gift + "입니다.");

    }
}
