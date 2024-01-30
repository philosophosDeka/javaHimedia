package com.ohgiraffers.section05.logical;

public class Application2 {

    public static void main(String[] args) {

        /* 논리 연산자의 우선순위
        *  && : 11순위
        *  || : 12순위
        * */

        int num1 = 55;
        /*
        *  1 <= 변수 <= 100(X) : 이항 연산자이기 때문
        *  변수 >= 1 && 변수 <= 100 (O)
        * */
        System.out.println("1부터 100 사이인지? : " + (num1 >= 1 && num1 <= 100));    //true

        int num2 = 175;
        System.out.println("1부터 100 사이인지? : " + (num1 >= 1 && num1 <= 100));    //false

        /* 영어 대문자인지 확인 */
        /* 문자변수 >= 'A' && 문자변수 <= 'Z' */
        char ch = 'T';
        System.out.println("영어 대문자인지? : " + (ch >= 'A' && ch <= 'Z'));      //true

        char ch2 = 'w';
        System.out.println("영어 대문자인지? : " + (ch2 >= 'A' && ch2 <= 'Z'));      //false

        /* 대소문자 상관없이 영문자 'y'인지 확인 */
        char ch3 = 'y';
        System.out.println("영문자 y인지? : " + (ch3 == 'Y' || ch3 == 'y'));     //true

        /* 영문자인지 확인 */
        /* A ~ Z : 65 ~ 90
        *  a ~ z : 97 ~ 120
        * */
        char ch5 = 'f';
        System.out.println("영문자인지 확인 : " + ((ch5 >= 'A' && ch5 <= 'Z')||(ch5 >= 'a' && ch5 <= 'z')));
        System.out.println("영문자인지 확인 : " + ((ch5 >= 65 && ch5 <= 90)||(ch5 >= 97 && ch5 <= 120)));



    }
}
