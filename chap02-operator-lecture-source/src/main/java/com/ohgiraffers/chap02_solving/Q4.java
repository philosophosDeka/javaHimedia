package com.ohgiraffers.chap02_solving;

public class Q4 {

    public static void main(String[] args) {

        double dnum = 90.5;
        int inum = (int)dnum;

        String score = (inum >= 90)? "A": (inum >= 80)? "B":
                (inum >= 70) ? "C" : (inum >= 60) ? "D" : "F";

        System.out.println("홍길동님의 이번 점수 등급은 " + score + "입니다.");



//        switch (inum) {
//            case 90 :
//                System.out.println("홍길동님의 이번 점수 등급은 A 입니다.");
//                break;
//            case 80 :
//                System.out.println("홍길동님의 이번 점수 등급은 B 입니다.");
//                break;
//            case 70 :
//                System.out.println("홍길동님의 이번 점수 등급은 C 입니다.");
//                break;
//            case 60 :
//                System.out.println("홍길동님의 이번 점수 등급은 D 입니다.");
//                break;
//            default :
//                System.out.println("홍길동님의 이번 점수 등급은 F 입니다.");
//                break;
//        }

//        if (inum >= 90) {
//            System.out.println("A");
//        } else if (inum >= 80) {
//            System.out.println("B");
//        } else if (inum >= 70) {
//            System.out.println("C");
//        } else if (inum >= 60) {
//            System.out.println("D");
//        } else {
//            System.out.println("F");
//        }
//        System.out.println("홍길동님의 이번 점수 등급은 " + inum + "입니다.");

    }
}
